package com.example.framework.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.framework.R
import com.example.framework.navigation.NavigationItem


@Composable
fun MainScreen(navController: NavHostController) {
    Box (modifier = Modifier.fillMaxSize()){
        Image (
            painter = painterResource(R.drawable.male_warrior),
            modifier = Modifier.fillMaxSize(),
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )
        Column (modifier = Modifier.padding(16.dp)
            .fillMaxHeight()
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Button(
                onClick = {
                    navController.navigate(NavigationItem.Recruit.route)
                },
                modifier = Modifier
                    .padding(10.dp)
                    //.align(Alignment.Center)
            )
            {
                Text("Recruit Screen")
            }
            Button(
                onClick = {
                    navController.navigate(NavigationItem.Empty.route)
                },
                modifier = Modifier.padding(10.dp)
            ) {
                Text("Empty Screen")
            }
        }
    }

}

/*@Preview
@Composable
fun MainScreenPreview() {
    FrameworkTheme {
        MainScreen(navController = NavHostController()
        )
    }
}*/


