package com.example.framework.characters

import com.example.framework.R

class CharacterDataSource {
    fun loadCharacters(): List<CharacterModel> {
        return listOf(
            CharacterModel(R.string.name_character1, R.string.attributes_character1, R.drawable.character1),
            CharacterModel(R.string.name_character2, R.string.attributes_character2, R.drawable.character2),
            CharacterModel(R.string.name_character3, R.string.attributes_character3, R.drawable.character3),
            CharacterModel(R.string.name_character4, R.string.attributes_character4, R.drawable.character4),
            CharacterModel(R.string.name_character5, R.string.attributes_character5, R.drawable.character5),
            CharacterModel(R.string.name_character6, R.string.attributes_character6, R.drawable.character6)
        )
    }
}