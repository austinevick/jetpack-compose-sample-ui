package com.example.composedictionaryapp.data

import androidx.annotation.DrawableRes
import com.example.composedictionaryapp.R

data class Data(
    @DrawableRes val images: Int,
    val title:String,
    val ingredients:List<String>
)

val items = listOf(
    Data(R.drawable.noodles, "Ramen", listOf("Noodles", "Eggs", "Mushrooms", "Carrots", "Soy Sauce")),
    Data(R.drawable.croissant, "Croissant", listOf("Butter", "More Butter", "A touch of Butter", "Flour")),
    Data(R.drawable.pizza, "Pizza", listOf("Pizza Dough", "Tomatoes", "Cheese", "Spinach", "Love")),
    Data(R.drawable.produce, "Vegetable Medley", listOf("Vegetables")),
    Data(R.drawable.salad_egg, "Egg Salad", listOf("Eggs", "Mayonnaise", "Paprika", "Mustard")),
    Data(R.drawable.smoothie, "Fruit Smoothie", listOf("Banana", "Kiwi", "Milk", "Cream", "Ice", "Flax seed"))
)