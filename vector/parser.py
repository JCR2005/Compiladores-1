import ply.yacc as yacc
from lexer import tokens

def validar_dimensiones(valores, dimensiones):
    """
    Valida recursivamente que 'valores' sea una lista con estructura *dentro* de las dimensiones dadas.
    No exige que todas las listas estén completas, solo que no excedan el tamaño máximo.
    """
    if not dimensiones:
        return not isinstance(valores, list)
    
    if not isinstance(valores, list):
        return False

    if len(valores) > dimensiones[0]:
        return False
    
    siguiente = dimensiones[1:]
    if not siguiente:
        return all(not isinstance(elem, list) for elem in valores)
    
    return all(validar_dimensiones(elem, siguiente) for elem in valores)


def construir_arreglo(dimensiones, valores, default=None):
    """
    Construye un arreglo Python de forma 'dimensiones', rellenando con 'default'
    donde no haya valores provistos.
    """
    if not dimensiones:
        # nivel escalar: valores es un primitivo
        return valores
    tamaño = dimensiones[0]
    resto = dimensiones[1:]
    resultado = []
    for i in range(tamaño):
        if isinstance(valores, list) and i < len(valores):
            sub = valores[i]
            # si aún hay niveles por debajo, recursión
            if resto:
                resultado.append(construir_arreglo(resto, sub, default))
            else:
                resultado.append(sub)
        else:
            # no hay valor provisto: relleno
            if resto:
                resultado.append(construir_arreglo(resto, [], default))
            else:
                resultado.append(default)
    return resultado


def p_declaracion_vector(t):
    """
    declaracion : VECTOR CORCHETEIZQ TIPO CORCHETEDER ID PARENIZQ dimensiones PARENDER PUNTOYCOMA
                 | VECTOR CORCHETEIZQ TIPO CORCHETEDER ID PARENIZQ dimensiones PARENDER IGUAL asignacion PUNTOYCOMA
    """
    dimensiones = t[7]

    # Sin inicialización: devolver arreglo relleno con None
    if len(t) == 10:
        t[0] = construir_arreglo(dimensiones, [])
        return

    # Con inicialización parcial o completa
    valores = t[10]
    if not validar_dimensiones(valores, dimensiones):
        print(f"Error semántico: los datos asignados no coinciden con las dimensiones {dimensiones}")
        t[0] = None
    else:
        t[0] = construir_arreglo(dimensiones, valores)


def p_dimensiones(t):
    '''dimensiones : ENTERO
                   | dimensiones COMA ENTERO'''
    if len(t) == 2:
        t[0] = [t[1]]
    else:
        t[0] = t[1] + [t[3]]


def p_elemento(t):
    '''elemento : expresion
                | lista_vectores'''
    t[0] = t[1]


def p_lista_expresiones(t):
    '''lista_expresiones : elemento
                         | lista_expresiones COMA elemento
                         | '''
    if len(t) == 1:
        t[0] = []
    elif len(t) == 2:
        t[0] = [t[1]]
    else:
        t[0] = t[1] + [t[3]]


def p_lista_vectores(t):
    'lista_vectores : CORCHETEIZQ lista_expresiones CORCHETEDER'
    t[0] = t[2]


def p_expresion(t):
    '''expresion : ENTERO
                 | DECIMAL'''
    t[0] = t[1]


def p_asignacion(t):
    '''asignacion : lista_vectores'''
    # entregamos la lista anidada tal cual
    t[0] = t[1]


# -----------------------
# Acceso a vectores
# -----------------------

def p_indices_vector(t):
    '''
    indices_vector : CORCHETEIZQ expresion CORCHETEDER
                   | indices_vector CORCHETEIZQ expresion CORCHETEDER
    '''
    if len(t) == 4:
        t[0] = [t[2]]
    else:
        t[0] = t[1] + [t[3]]


def p_acceso_vector(t):
    '''
    expresion : ID indices_vector
    '''
    t[0] = ('ACCESO_VECTOR', t[1], t[2])


def p_error(t):
    if t:
        print(f"Error de sintaxis: token inesperado '{t.value}' en línea {t.lineno}")
    else:
        print("Error de sintaxis: entrada incompleta")


parser = yacc.yacc()
