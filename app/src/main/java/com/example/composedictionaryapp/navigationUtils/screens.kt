package com.example.composedictionaryapp

sealed class Screens(val route:String){
    object LoginScreen:Screens("login")
    object HomePage: Screens("home")
}
