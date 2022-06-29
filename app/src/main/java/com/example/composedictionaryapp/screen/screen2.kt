package com.example.composedictionaryapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen2(){
    Scaffold()
    {
Column() {
    Column(modifier = Modifier
        .height(300.dp)
        .fillMaxSize()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Blue.copy(0.6f)),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        Card(
            modifier = Modifier
                .height(80.dp)
                .width(80.dp),
            shape = RoundedCornerShape(50.dp),
            backgroundColor = Color.Black
        ) {}
        Spacer(modifier = Modifier.height(15.dp))
        Text("Augustine Victor", color = Color.White, fontSize = 20.sp)
        Text(text = "Mobile Developer",color = Color.White.copy(0.8f),
            fontSize = 15.sp)
        Spacer(modifier = Modifier.height(60.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(horizontal = 25.dp),
            horizontalArrangement =Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BuildText(title = "75k", subTitle = "Followers")
            BuildText(title = "16k", subTitle = "Following")
            BuildText(title = "100", subTitle = "Projects")
        } }
    Spacer(modifier = Modifier.height(16.dp))

    Row(modifier = Modifier
            .fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement =Arrangement.SpaceBetween
    ) {
        Text("Folder")
        Text(text = "View all", color = Color.DarkGray,
            fontWeight = FontWeight.W800)
    }
}
    }
}
@Composable
fun BuildText(title:String, subTitle:String){
    Column(
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = title,color = Color.White, fontSize = 20.sp,
            fontWeight = FontWeight.Bold)
        Text(text = subTitle,color = Color.White.copy(0.5f))
    }
}

@Preview
@Composable
fun Home1Preview(){
    Screen2()
}