package com.example.framework.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.framework.screens.EmptyScreen
import com.example.framework.screens.MainScreen
import com.example.framework.screens.RecruitScreen

enum class Screen {
    Start,
    Recruit,
    Empty
}

sealed class NavigationItem(val route: String) {
    data object Start : NavigationItem(Screen.Start.name)
    data object Recruit : NavigationItem(Screen.Recruit.name)
    data object Empty: NavigationItem(Screen.Empty.name)
}

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavigationItem.Start.route
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Start.route) {
            MainScreen(navController)
        }
        composable(NavigationItem.Recruit.route) {
            RecruitScreen(navController, modifier)
        }
        composable(NavigationItem.Empty.route) {
            EmptyScreen()
        }
    }
}