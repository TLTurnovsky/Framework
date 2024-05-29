package com.example.framework.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.framework.screens.MainScreen
import com.example.framework.screens.recruit.RecruitScreen
import com.example.framework.screens.RulesScreen

enum class Screen {
    Start,
    Recruit,
    Rules
}

sealed class NavigationItem(val route: String) {
    data object Start : NavigationItem(Screen.Start.name)
    data object Recruit : NavigationItem(Screen.Recruit.name)
    data object Rules: NavigationItem(Screen.Rules.name)
}

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavigationItem.Start.route,
    paddingValues: PaddingValues
) {
    NavHost(
        modifier = modifier.padding(paddingValues),
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Start.route) {
            MainScreen(modifier = Modifier.padding(paddingValues))
        }
        composable(NavigationItem.Recruit.route) {
            RecruitScreen( modifier = Modifier.padding(paddingValues))
        }
        composable(NavigationItem.Rules.route) {
            RulesScreen(modifier = Modifier.padding(paddingValues))
        }
    }
}