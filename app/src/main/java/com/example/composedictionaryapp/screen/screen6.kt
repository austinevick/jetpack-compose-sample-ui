package com.example.composedictionaryapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedictionaryapp.R

@Composable
fun Screen6() {
    Scaffold() {
        Column(modifier = Modifier.fillMaxSize(), 
        ) {
            Image(
                painter = painterResource(id = R.drawable.pizza), contentDescription = null,
                contentScale = ContentScale.FillWidth, modifier =
                Modifier.clip(
                        RoundedCornerShape(
                            bottomEnd = 20.dp, bottomStart = 20.dp
                        )
                    )
                    .fillMaxWidth())
            Column(
                modifier = Modifier.fillMaxSize(),
                 horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround

            ) {
                Text(text = "Come take the picture you want and perfect it with us",
                    fontSize = 20.sp, fontWeight = FontWeight.W800,
                    textAlign = TextAlign.Center, modifier = Modifier.padding(25.dp))
                Text(text = "Experience photography in a new dimension")
                Spacer(modifier = Modifier.height(50.dp))
                Button(onClick = { /*TODO*/ },
                    Modifier
                        .clip(
                            RoundedCornerShape(25.dp)).fillMaxWidth().padding(16.dp)
                ) {
                    Text(text = "Take Picture Now")
                }
            }


        }
    }
}


@Preview
@Composable
fun Screen6Prev() {
    Screen6()
}