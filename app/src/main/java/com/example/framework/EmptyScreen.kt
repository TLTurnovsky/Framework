package com.example.framework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.framework.ui.theme.FrameworkTheme

@Composable
fun EmptyScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(color = Color.Blue)
        .fillMaxSize()
        ){
/*        Image(modifier = Modifier.fillMaxHeight(),
            painter = painterResource(R.drawable.female_warrior),
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )*/
    }
}

@Preview
@Composable
fun EmptyScreenPreview(){
    EmptyScreen(navController = NavHostController(context = LocalContext.current))
}



