package com.example.framework


//import androidx.compose.material3.TopAppBar
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.example.framework.ui.theme.FrameworkTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavHost()
            FrameworkTheme() /*{

                val navController = rememberNavController()
                val scope = rememberCoroutineScope()
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

                Scaffold (
                    topBar = {
                        TopAppBar(title = { Text(text = "Framework") },
                            navigationIcon = {
                                IconButton(onClick = { scope.launch{drawerState.open()} }) {
                                    Icon(
                                        Icons.Filled.Menu,
                                        contentDescription = "Menu"
                                    )
                                }
                            })
                    }
                ) {
*//*                    ModalNavigationDrawer(
                        drawerState = drawerState,
                        content = content
                    ) {
                        DrawerContent(
                            onItemClicked = {route ->
                                scope.launch {
                                    drawerState.close()
                                    navController.navigate(route)
                                }
                            }
                        )
                    }*//*
                }
            }*/
            {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()
                Scaffold (
                    topBar = {
                        AppBar (
                            onNavigationIconClick = {
                                scope.launch {
                                    scaffoldState.drawerState.open()                                }
                            }
                        ) {

                        }
                    },

                ) {

                }
            }
        }
    }
}

/*
@Composable
fun DrawerContent(onItemClicked: (String) -> Unit) {
    ListItem(
        icon = { Icon(Icons.Filled.Home, contentDescription = "Home")},
        text = {Text(stringResource(id = R.string.app_name))},
        onClick = {onItemClicked("main")}
    )
    ListItem(
        icon = { Icon(Icons.Filled.Star, contentDescription = "Recruit Screen")},
        text = {Text(stringResource(id = R.string.title_activity_recruit_screen))},
        onClick = {onItemClicked("recruit")}
    )
}*/
