package com.ravemaster.composethreepostcard

import androidx.annotation.DrawableRes

data class Publisher(
    val name:String,
    @DrawableRes val image:Int,
    val job:String
)
