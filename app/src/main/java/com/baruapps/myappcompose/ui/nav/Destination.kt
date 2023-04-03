package com.baruapps.myappcompose.ui.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destination(val route: String, val title: String, val icon: ImageVector) {
    object IU01 : Destination("iu01", "Pantalla1", Icons.Filled.Home)
    object IU02 : Destination("iu02/?myText={myText}","Pantalla2", Icons.Filled.Settings) {
        fun createRoute(myText: String) = "iu02/?myText=$myText"
    }

    object IU03 : Destination("iu03","Pantalla3", Icons.Filled.Favorite)
}
