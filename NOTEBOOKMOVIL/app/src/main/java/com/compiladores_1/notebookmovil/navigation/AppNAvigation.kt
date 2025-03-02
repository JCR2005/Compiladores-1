package com.compiladores_1.notebookmovil.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.compiladores_1.notebookmovil.pantllas.paginaPrincipal
import com.compiladores_1.notebookmovil.pantllas.agregarTarea

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.paginaPrincipal.route
    ) {
       composable(route=AppScreens.paginaPrincipal.route){
           paginaPrincipal(navController)
       }
        composable(route=AppScreens.agregarTarea.route){
            agregarTarea(navController)
        }
    }
}
