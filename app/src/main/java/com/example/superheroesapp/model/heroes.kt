package com.example.superheroesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class heroes(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
