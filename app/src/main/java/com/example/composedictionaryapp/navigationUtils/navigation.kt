package com.example.composedictionaryapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation(){
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.LoginScreen.route){
        composable(Screens.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(Screens.HomePage.route){

        }
    }
}