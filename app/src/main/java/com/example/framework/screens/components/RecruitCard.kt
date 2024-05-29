package com.example.framework.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.framework.data.CharacterModel

@Composable
fun RecruitCard(character: CharacterModel) {
    Card (modifier = Modifier
        .fillMaxWidth()
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


