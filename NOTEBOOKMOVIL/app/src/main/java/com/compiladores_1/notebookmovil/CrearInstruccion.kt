package com.compiladores_1.notebookmovil

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
@Composable
fun PanelFlotante() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    )
}
// ==========================
// 📌 PANEL 2 Y SU NAVEGACIÓN
// ==========================
@Composable
fun Panel2Container() {
    var pantallaPanel2 by remember { mutableStateOf("inicio") }

    Box(
        modifier = Modifier.fillMaxWidth().background(Color.DarkGray).padding(16.dp)
    ) {
        when (pantallaPanel2) {
            "inicio" -> Panel2Inicio(
                irASubPanelA = { pantallaPanel2 = "subA" },
                irASubPanelB = { pantallaPanel2 = "subB" }
            )

        }
    }
}

@Composable
fun Panel2Inicio(irASubPanelA: () -> Unit, irASubPanelB: () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Panel 2 - Inicio", color = Color.White)
        Button(onClick = irASubPanelA) { Text("Ir a SubPanel A") }
        Button(onClick = irASubPanelB) { Text("Ir a SubPanel B") }
    }
}

