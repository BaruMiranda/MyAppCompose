package com.baruapps.myappcompose.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.baruapps.myappcompose.ui.files.IU01
import com.baruapps.myappcompose.ui.files.IU02
import com.baruapps.myappcompose.ui.files.IU03

@Composable
fun NavigationHost(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = Destination.IU01.route) {
        composable(Destination.IU01.route) {
            IU01(navegationComponet = {
                navController.navigate(Destination.IU02.createRoute(it))
            })
        }
        composable(
            Destination.IU02.route,
            arguments = listOf(navArgument("myText") { defaultValue = "IU02" })
        ) {
            val myText = it.arguments?.getString("myText")
            requireNotNull(myText)
            IU02(myText)
        }
        composable(Destination.IU03.route) {
            IU03()
        }
    }

}