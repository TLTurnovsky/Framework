package com.example.framework.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun EmptyScreen() {
    Box(modifier = Modifier
        .background(color = Color.Blue)
        .fillMaxSize()
        ){
    }
}

@Preview
@Composable
fun EmptyScreenPreview(){
    EmptyScreen(navController = NavHostController(context = LocalContext.current))
}



