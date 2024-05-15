package com.example.framework.characters

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CharacterModel(
    @StringRes val characterNameResourceID: Int,
    @StringRes val characterAttributesResourceID: Int,
    @DrawableRes val characterPictureResourceID: Int
)
