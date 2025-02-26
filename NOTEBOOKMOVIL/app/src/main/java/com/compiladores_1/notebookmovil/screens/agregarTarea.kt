package com.compiladores_1.notebookmovil.screens


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import android.util.Log
import androidx.compose.runtime.LaunchedEffect

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.compiladores_1.notebookmovil.Backend.Compilador
import com.compiladores_1.notebookmovil.R
import com.compiladores_1.notebookmovil.navigation.AppScreens


var exito=false;
var MostrarMensaje=false;

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun agregarTarea(navController: NavController){
    Scaffold(
        content = {
            AgregarTareaConteiner(navController)
        }
    )
}

@Composable
fun AgregarTareaConteiner(navController: NavController){
    Column (
        modifier=Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        EncabezadoAgregarTarea(navController)
        cuerpoAgregarTarea(navController)
    }

}

@Composable
fun EncabezadoAgregarTarea(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.07f)
            .background(Color(0xFF18165D))
            .padding(top = 1.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ElevatedButton(
            modifier = Modifier
                .size(40.dp)
                .padding(start = 5.dp),
            onClick = {  navController.navigate(route= AppScreens.paginaPrincipal.route)},
            contentPadding = PaddingValues(0.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.regresar   ),
                contentDescription = "Opciones",
                modifier = Modifier
                    .size(20.dp)
                    .padding(0.dp),
                contentScale = ContentScale.Crop
            )
        }

    }
}

@Composable
fun cuerpoAgregarTarea(navController: NavController) {
    var texto by remember { mutableStateOf("") }
    var resultadoAnalisis by remember { mutableStateOf("") }
    var analisisExitodo by remember { mutableStateOf(false)}
    val compilador = remember { Compilador() }

    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InputTextField(
            text = texto,
            onTextChange = { texto = it }
        )

        // Solo mostrar el Corrector si hay un resultado
        if (resultadoAnalisis.isNotEmpty()) {
            Corrector(resultadoAnalisis)
            Guardar();
        }

        Spacer(modifier = Modifier.weight(1f))

        Row {
            Button(
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
                    .align(Alignment.Bottom)
                    .padding(start = 15.dp)
                    .padding(bottom = 30.dp),
                onClick = {
                    navController.navigate(route = AppScreens.paginaPrincipal.route)
                },
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(0xFF18165D)
                )
            ) {
                Text(
                    "Cancelar",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500
                )
            }

            Button(
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
                    .align(Alignment.Bottom)
                    .padding(end = 15.dp)
                    .padding(bottom = 30.dp),
                onClick = {
                    analisisExitodo=compilador.analisisExito;

                },
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(0xFF18165D)
                )
            ) {
                Text(
                    "Analizar",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500
                )
            }


        }

        Spacer(modifier = Modifier.height(16.dp)) // Asegura espacio antes del botón "Guardar"


    }
}

@Composable
fun Guardar(){
Row {

    Button(
        modifier = Modifier
            .width(200.dp)
            .align(Alignment.Bottom)
            .height(90.dp)
            .padding(bottom = 30.dp),
        onClick = {

        },
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = Color(0xFF18165D)
        ),
    ) {
        Text(
            "Guardar",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.W500
        )
    }


}

}

@Composable
fun Corrector(respuesta: String) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Transparent)
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
    ) {
        Text(
            text = respuesta,
            modifier = Modifier.padding(16.dp),
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)@Composable
fun InputTextField(text: String, onTextChange: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = onTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .heightIn(min = 56.dp),
            placeholder = { Text("Ingresa tu instrucción aquí") },
            singleLine = false,
            maxLines = Int.MAX_VALUE,
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


var texto = "";

@Preview(showBackground = true)
@Composable
fun GreetingsPreviewAgregarTarea() {
    val fakeNavController = rememberNavController()
    MaterialTheme {
        AgregarTareaConteiner(navController = fakeNavController)
    }
}

