import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compiladores_1.notebookmovil.R

@Composable
fun PantallaPrincipal() {
    // Usar mutableStateListOf para que Compose detecte cambios en la lista
    val paneles = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Encabezado()

        Cuerpo(
            agregarPanelCodigo = {
                paneles.add("Panel Código ${paneles.size + 1}")  // Agregar nuevo panel
            }
        )

        // Mostrar dinámicamente los paneles agregados
        paneles.forEach { panel ->
            PanelCodigo(texto = panel)
        }
    }
}

@Composable
fun Encabezado() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFF18165D))
        ) {
            Text(
                " Notebook ",
                modifier = Modifier.align(Alignment.CenterStart),
                color = Color.White,
                fontSize = 35.sp,
                fontWeight = FontWeight.W100,
                fontStyle = FontStyle.Italic
            )

            ElevatedButton(
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 5.dp)
                    .align(Alignment.CenterEnd),
                onClick = { },
                contentPadding = PaddingValues(0.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.opciones),
                    contentDescription = "Opciones",
                    modifier = Modifier
                        .size(20.dp)
                        .padding(0.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Composable
fun Cuerpo(agregarPanelCodigo: () -> Unit) {
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
            onClick = { println("Botón presionado") },
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = Color(0xFF18165D)
            )
        ) {
            Text(
                "+ Texto",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.W500
            )
        }

        Button(
            modifier = Modifier
                .width(200.dp)
                .height(60.dp)
                .padding(5.dp),
            onClick = agregarPanelCodigo,
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = Color(0xFF18165D)
            )
        ) {
            Text(
                "+ Código",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.W500
            )
        }
    }
}

// Cada panel agregado se verá así
@Composable
fun PanelCodigo(texto: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color(0xFFCCCCCC))
    ) {
        Text(
            text = texto,
            modifier = Modifier.padding(16.dp),
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantalla() {
    MaterialTheme {
        PantallaPrincipal()
    }
}
