package com.example.framework.screens.recruit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.framework.data.CharacterModel
import com.example.framework.screens.components.RecruitCard

@Composable
fun RecruitScreen(
    modifier: Modifier = Modifier,
    recruitViewModel: RecruitViewModel = viewModel(factory = RecruitViewModelFactory())
    ) {
    val characterList by recruitViewModel.characterList.collectAsState()

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray)
        ){
        CharacterList(characterList = characterList)
    }
}


@Composable
fun CharacterList (characterList: List<CharacterModel>, modifier: Modifier = Modifier) {
    LazyColumn (modifier = modifier) {
        items (characterList) {character ->
            RecruitCard(character = character)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RecruitPreview() {
    RecruitScreen(modifier = Modifier)
}
