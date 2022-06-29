package com.example.composedictionaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedictionaryapp.screen.Screen4
import com.example.composedictionaryapp.screen.Screen5
import com.example.composedictionaryapp.screen.Screen6

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent {
Screen6()
           }
       }
}





@Composable
@Preview
fun H(){
Screen6()
}


