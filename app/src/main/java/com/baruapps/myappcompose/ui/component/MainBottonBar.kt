package com.baruapps.myappcompose.ui.component

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.baruapps.myappcompose.ui.nav.Destination
import com.baruapps.myappcompose.ui.nav.NavigationHost

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainViewBottomBar() {
    val navController = rememberNavController()
    val navigationsItems = listOf(
        Destination.IU01,
        Destination.IU02,
        Destination.IU03
    )
    Scaffold(bottomBar = {
        BottomNavigationBar(
            navControler = navController,
            items = navigationsItems
        )
    }){
        NavigationHost(navController)
    }
}