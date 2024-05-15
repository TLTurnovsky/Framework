package com.example.framework

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.framework.ui.theme.FrameworkTheme


@Composable
fun MainScreen(navController: NavHostController, modifier: Modifier) {
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


