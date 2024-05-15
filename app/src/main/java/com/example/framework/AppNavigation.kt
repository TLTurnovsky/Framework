package com.example.framework

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Screen {
    Start,
    Recruit,
    Empty
}

sealed class NavigationItem(val route: String) {
    object Start : NavigationItem(Screen.Start.name)
    object Recruit : NavigationItem(Screen.Recruit.name)
    object Empty: NavigationItem(Screen.Empty.name)
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
            MainScreen(navController, modifier)
        }
        composable(NavigationItem.Recruit.route) {
            RecruitScreen(navController, modifier)
        }
        composable(NavigationItem.Empty.route) {
            EmptyScreen(navController, modifier)
        }
    }
}