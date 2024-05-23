package com.example.framework.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.lazy.items
import com.example.framework.data.CharacterModel
import com.example.framework.data.CharacterDataSource

@Composable
fun RecruitScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue)
        ){
        CharacterList(characterList = CharacterDataSource().loadCharacters())
    }
}



@Composable
fun RecruitCard2(character: CharacterModel, modifier: Modifier) {
    Card (modifier = Modifier.fillMaxWidth()
        .padding(8.dp)
        .height(150.dp)
    ) {
        Row() {
            Image(
                painter = painterResource(character.characterPictureResourceID),
                contentDescription = "",
                modifier = Modifier.width(100.dp)
            )
            Column() {
                Text(
                    text = LocalContext.current.getString(character.characterNameResourceID),
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = LocalContext.current.getString(character.characterAttributesResourceID),
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun CharacterList (characterList: List<CharacterModel>, modifier: Modifier = Modifier) {
    LazyColumn (modifier = modifier) {
        items (characterList) {character ->
            RecruitCard2(character = character, modifier = Modifier)
        }
    }
}


@Preview
@Composable
fun RecruitPreview() {
    RecruitScreen(navController = NavHostController(context = LocalContext.current), modifier = Modifier)
}
