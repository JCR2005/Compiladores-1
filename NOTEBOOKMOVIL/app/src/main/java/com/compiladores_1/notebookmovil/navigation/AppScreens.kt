package com.compiladores_1.notebookmovil.navigation

sealed class AppScreens(val route:String) {
    object  paginaPrincipal: AppScreens("paginaPrincipal")
    object  agregarTarea: AppScreens("agregarTarea")
}