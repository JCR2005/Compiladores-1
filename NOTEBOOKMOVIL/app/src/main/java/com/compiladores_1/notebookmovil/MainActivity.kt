package com.compiladores_1.notebookmovil

import PantallaPrincipal
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compiladores_1.notebookmovil.navigation.AppNavigation
import com.compiladores_1.notebookmovil.ui.theme.NOTEBOOKMOVILTheme

    class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NOTEBOOKMOVILTheme {

               AppNavigation()
            }
        }
    }
}


@Composable
fun ContenedorPrincipal() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RectangleShape)
    ) {
        PantallaPrincipal()
    }
}


@Composable
fun CrearPanelParaIngresarInformacion() {
    var texto by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color(0xFF18165D)),

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.80f)
                .heightIn(min = 40.dp, max = 200.dp)
                .clip(RoundedCornerShape(20.dp))
                .align(Alignment.CenterEnd)
                .verticalScroll(rememberScrollState())
        ) {
            TextField(
                value = texto,
                onValueChange = { textoNuevo -> texto = textoNuevo },
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = Int.MAX_VALUE,
                placeholder = { Text("Ingresa algo...") }
            )
        }

        ElevatedButton(
            modifier = Modifier

                .size(55.dp)

                .align(Alignment.CenterStart),
            onClick = {},
            contentPadding = PaddingValues(0.dp)

        ) {
            Image(
                painter = painterResource(R.drawable.guardar),
                contentDescription = "Opciones",
                modifier = Modifier
                    .size(35.dp),

                contentScale = ContentScale.Crop
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NOTEBOOKMOVILTheme {
        AppNavigation()
    }
}
