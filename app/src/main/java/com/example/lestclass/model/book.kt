package com.example.lestclass.model
import androidx.annotation.DrawableRes


//// add mutable string and image //

data class book(val stringResourceId: Int,
                @DrawableRes val imageResourceId: Int)
