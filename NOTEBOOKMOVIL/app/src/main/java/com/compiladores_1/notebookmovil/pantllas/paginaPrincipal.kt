package com.compiladores_1.notebookmovil.pantllas

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.compiladores_1.notebookmovil.Backend.Compilador.Compilador
import kotlin.OptIn

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun paginaPrincipal(navController: NavController) {
    Scaffold(
        content = {
            paginaPrincipalConteiner(navController)
        }
    )
}
@Preview(showBackground = true)
@Composable
fun PreviewCuerpoPaneles() {
    CuerpoPaneles(
        paneles = listOf(
            PanelState(texto = "Panel 1"),
            PanelState(texto = "Panel 2"),
            PanelState(texto = "Panel 3")
        ),
        onGuardar = {}
    )
}


@Composable
fun paginaPrincipalConteiner(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Encabezado()

        CuerpoPaginaPrincipal(navController = navController)
    }
}
@Composable
fun Correctore(
    mensaje: String,
    respuesta: String,
    compilador: Compilador // Pasar como parámetro

) {
    Column(

        modifier = Modifier
            .padding(16.dp)
            .offset(3.dp, 90.dp)
            .background(Color(0xFFEAEEFA))
            .border(10.dp, Color(0xFF0C1138), shape = RoundedCornerShape(14.dp))
            .fillMaxWidth()
    ) {

        val Colorin = if (compilador.analisisExito) {
            Color(0xFF417540)

        } else{ Color(0xFF890708)}

        Text(
            text = mensaje,
            modifier = Modifier.padding(16.dp),
            color = Colorin,
            fontWeight = FontWeight.W900,
        )

     when {
            compilador.analizadorMarkdown.isEncabezado -> headers(compilador.analizadorMarkdown.tamaño, respuesta)
            compilador.analizadorMarkdown.isTextoFormato -> formato(compilador.analizadorMarkdown.estilo, respuesta)
            compilador.analizadorMarkdown.isParrafo -> Parrafo(respuesta)
            compilador.analizadorMarkdown.isLista -> lista(compilador.analizadorMarkdown.listaNumerica)
            compilador.analizadorMarkdown.isLista_Numeros -> lista(compilador.analizadorMarkdown.listaNumerica)
            compilador.analizadorCodigo.analisisExito -> Parrafo(respuesta)
            else -> mesaje(respuesta)
        }
    }
}


@Composable
fun lista( respuesta: Array<String>){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEAEEFA), shape = RoundedCornerShape(12.dp))
            .heightIn(max = 220.dp)

            .verticalScroll(rememberScrollState()),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            for (item in respuesta) {
                Text(
                    text = item,
                    color = Color(0xFF0A0A0A),
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
        }

    }
}

@Composable
fun Parrafo( respuesta: String){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEAEEFA), shape = RoundedCornerShape(12.dp))
            .heightIn(max = 220.dp)

            .verticalScroll(rememberScrollState()),
    ) {
        Text(
            text = respuesta,
            modifier = Modifier.padding(16.dp),
            color = Color(0xFF0A0A0A),
            fontWeight = FontWeight.Normal,
        )
    }
}

@Composable
fun mesaje( respuesta: String){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEAEEFA), shape = RoundedCornerShape(12.dp))
            .heightIn(max = 220.dp)

            .verticalScroll(rememberScrollState()),
    ) {


        Text(
            text = respuesta,
            modifier = Modifier.padding(16.dp),
            color = Color(0xFF0A0A0A),
            fontWeight = FontWeight.Bold
        )



    }
}

@Composable
fun headers(tamaño:  Double, respuesta: String){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEAEEFA), shape = RoundedCornerShape(12.dp))
            .heightIn(max = 220.dp)

            .verticalScroll(rememberScrollState()),
        ) {


            Text(
                text = respuesta,
                modifier = Modifier.padding(16.dp),
                color = Color(0xFF0A0A0A),
                fontSize = tamaño.sp,
            )
    }
}

@Composable
fun formato(estilo:  Double, respuesta: String){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEAEEFA), shape = RoundedCornerShape(12.dp))
            .heightIn(max = 220.dp)

            .verticalScroll(rememberScrollState()),
    ) {
        val fontWeight = when (estilo) {
            2.00, 3.00 -> FontWeight.W900
            else -> null
        }

        val fontStyle = when (estilo) {
            1.00, 3.00 -> FontStyle.Italic
            else -> null
        }

        Text(
            text = respuesta,
            modifier = Modifier.padding(16.dp),
            color = Color(0xFF0A0A0A),
            fontWeight = fontWeight,
            fontStyle = fontStyle
        )

    }
}

var AnalizadorEnUso=false;

@Composable
fun CuerpoPaginaPrincipal(navController: NavController) {
    var paneles by remember { mutableStateOf(listOf<PanelState>()) }
    var botonCrear by remember { mutableStateOf(true) }
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
                    .padding(5.dp),
                    enabled = botonCrear,
                onClick = {
                    paneles = paneles + PanelState(texto = "")
                    AnalizadorEnUso=true
                    botonCrear = false
                },
                colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFF18165D))
            ) {
                Text("+ Texto", color = Color.White, fontSize = 20.sp)
            }
            Button(
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
                    .padding(5.dp),
                enabled = botonCrear,
                onClick = {
                    AnalizadorEnUso=false
                    paneles = paneles + PanelState(texto = "")
                    botonCrear = false
                },
                colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFF18165D))
            ) {
                Text("+ Código", color = Color.White, fontSize = 20.sp)
            }
        }


        CuerpoPaneles(paneles, onGuardar = { nuevosPaneles ->
            paneles = nuevosPaneles
            botonCrear = true


        })
    }
}


@Composable
fun CuerpoPaneles(paneles: List<PanelState>, onGuardar: (List<PanelState>) -> Unit) {
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier.verticalScroll(scrollState)
    ){
        paneles.forEachIndexed { index, panelState ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .height(panelState.valor)
                    .background(Color(0xFFCAD5EF))
            ) {
                if (panelState.boton) {
                    Button(
                        onClick = {
                            val newPaneles = paneles.toMutableList().apply {
                                this[index] = this[index].copy(
                                    valor = 400.dp,
                                    corrector=true,

                                )
                            }
                            panelState.compilador.compilar(panelState.texto, AnalizadorEnUso)
                            onGuardar(newPaneles)
                        },
                        modifier = Modifier
                            .width(90.dp)
                            .height(60.dp)
                            .offset(5.dp, 20.dp),
                        colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFF18165D))
                    ) {
                        Text("▶", color = Color.White, fontSize = 40.sp)
                    }
                }
                InputTextFieldw(
                    text = panelState.texto,
                    onTextChange = { newText ->
                        val newPaneles = paneles.toMutableList().apply {
                            this[index] = this[index].copy(texto = newText)
                        }
                        onGuardar(newPaneles)
                    },
                    enabled = panelState.textFieldEnabled
                )
                if (panelState.corrector) {
                    Correctore(
                        mensaje = panelState.compilador.mesaje,
                        respuesta = panelState.compilador.intruccion,
                        panelState.compilador
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    if (panelState.boton1) {
                        Button(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(40.dp)
                                .align(Alignment.BottomStart),
                            onClick = {


                                val newPaneles = paneles.toMutableList().apply {
                                    if (this[index].texto.isNotBlank()) {
                                        this[index] = this[index].copy(
                                            valor = 150.dp,
                                            boton = true,
                                            boton1 = false,
                                            textFieldEnabled = false
                                        )
                                    }
                                }

                                onGuardar(newPaneles)
                            },
                            colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFF18165D))
                        ) {
                            Text("Guardar", color = Color.White, fontSize = 20.sp)
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)

                ) {
                    if (!panelState.boton1) {
                        Button(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(40.dp)
                                .align(Alignment.BottomEnd),
                            onClick = {
                                val newPaneles = paneles.toMutableList().apply {
                                    this[index] = this[index].copy(
                                        textFieldEnabled = true,
                                        boton1 = true,
                                        corrector=false,
                                        valor = 200.dp,
                                        boton = false
                                    )
                                }
                                onGuardar(newPaneles)
                            },
                            colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFF18165D))
                        ) {
                            Text("Editar", color = Color.White, fontSize = 20.sp)
                        }
                        Button(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(40.dp)
                                .align(Alignment.BottomStart),
                            onClick = {
                                val newPaneles = paneles.toMutableList().apply {
                                    removeAt(index)
                                }
                                onGuardar(newPaneles)

                            },
                            colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFF18165D))
                        ) {
                            Text("Eliminar", color = Color.White, fontSize = 20.sp)
                        }
                    }
                }
            }
        }
    }
}



data class PanelState(
    var texto: String = "",
    var valor: Dp = 200.dp,
    var boton: Boolean = false,
    var boton1: Boolean = true,
    var textFieldEnabled: Boolean = true,
    var respuestaCorrector: String = "",
    var corrector: Boolean = false,
    val compilador: Compilador = Compilador()
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputTextFieldw(text: String, onTextChange: (String) -> Unit, enabled: Boolean) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 10.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .padding(8.dp)
                .background(Color.White, shape = RoundedCornerShape(12.dp))
        ) {
            OutlinedTextField(
                value = text,
                onValueChange = onTextChange,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .heightIn(max = 80.dp)
                    .align(Alignment.CenterEnd),
                enabled = enabled,
                placeholder = { Text("Ingresa tu instrucción aquí") },
                singleLine = false,
                maxLines = 6,
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF162C5E),
                    unfocusedBorderColor = Color.Gray,
                    cursorColor = Color(0xFF162C5E)
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp
                )
            )
        }
    }
}

@Composable
fun Encabezado() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color(0xFF18165D)),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            " Notebook ",
            color = Color.White,
            fontSize = 35.sp
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantalla() {
    val fakeNavController = rememberNavController()
    MaterialTheme {
        paginaPrincipalConteiner(navController = fakeNavController)
    }
}
