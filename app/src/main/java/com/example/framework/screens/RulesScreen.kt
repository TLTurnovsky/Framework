package com.example.framework.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RulesScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(color = Color.Yellow)
        .fillMaxSize()
        ){
    }
}

@Preview
@Composable
fun EmptyScreenPreview(){
    RulesScreen(Modifier)
}



