# lexer.py
import ply.lex as lex

reserved = {
    'Vector': 'VECTOR',
    'int': 'TIPO',
    'float': 'TIPO',
    'double': 'TIPO',
    'char': 'TIPO'
}

tokens = [
    'ID', 'ENTERO', 'DECIMAL',
    'IGUAL', 'COMA', 'PUNTOYCOMA',
    'CORCHETEIZQ', 'CORCHETEDER',
    'PARENIZQ', 'PARENDER',
] + list(set(reserved.values()))

t_IGUAL        = r'='
t_COMA         = r','
t_PUNTOYCOMA   = r';'
t_CORCHETEIZQ  = r'\['
t_CORCHETEDER  = r'\]'
t_PARENIZQ     = r'\('
t_PARENDER     = r'\)'

def t_DECIMAL(t):
    r'\d+\.\d+'
    t.value = float(t.value)
    return t

def t_ENTERO(t):
    r'\d+'
    t.value = int(t.value)
    return t

def t_ID(t):
    r'[a-zA-Z_][a-zA-Z_0-9]*'
    t.type = reserved.get(t.value, 'ID')
    return t

t_ignore = ' \t'

def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)

def t_error(t):
    print(f"Caracter ilegal: '{t.value[0]}'")
    t.lexer.skip(1)

lexer = lex.lex()
