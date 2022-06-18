package com.example.composedictionaryapp

import androidx.annotation.DrawableRes

data class CardItems(
    @DrawableRes val images: Int,
    val title:String,
    val ingredients:List<String>
)

val items = listOf(
    CardItems(R.drawable.noodles, "Ramen", listOf("Noodles", "Eggs", "Mushrooms", "Carrots", "Soy Sauce")),
    CardItems(R.drawable.croissant, "Croissant", listOf("Butter", "More Butter", "A touch of Butter", "Flour")),
    CardItems(R.drawable.pizza, "Pizza", listOf("Pizza Dough", "Tomatoes", "Cheese", "Spinach", "Love")),
    CardItems(R.drawable.produce, "Vegetable Medley", listOf("Vegetables")),
    CardItems(R.drawable.salad_egg, "Egg Salad", listOf("Eggs", "Mayonnaise", "Paprika", "Mustard")),
    CardItems(R.drawable.smoothie, "Fruit Smoothie", listOf("Banana", "Kiwi", "Milk", "Cream", "Ice", "Flax seed"))
)