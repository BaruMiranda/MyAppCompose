package com.baruapps.myappcompose.ui.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.baruapps.myappcompose.ui.nav.Destination

@Composable
fun BottomNavigationBar(navControler: NavHostController, items: List<Destination>) {
    val currentRoute = currentRoute(navControler = navControler)
    BottomNavigation {
        items.forEach { view ->
            BottomNavigationItem(
                icon = { Icon(imageVector = view.icon, contentDescription = view.title) },
                label = { Text(text = view.title) },
                selected = currentRoute == view.route,
                onClick = {
                          navControler.navigate(view.route){
                              popUpTo(navControler.graph.findStartDestination().id){
                                  saveState = true
                              }
                              launchSingleTop = true
                          }
                },
                alwaysShowLabel = false
            )

        }
    }
}


@Composable
private fun currentRoute(navControler: NavHostController): String? {
    val navBackStackEntry by navControler.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}