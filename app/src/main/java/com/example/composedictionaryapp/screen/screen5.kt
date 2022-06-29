package com.example.composedictionaryapp.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen5(){

   Scaffold() {
       Column(
           horizontalAlignment = Alignment.CenterHorizontally,
           modifier = Modifier
               .fillMaxWidth()
               , verticalArrangement = Arrangement.SpaceEvenly
       ) {
           Spacer(modifier = Modifier.height(25.dp))

           Card(
               modifier = Modifier
                   .height(80.dp)
                   .width(80.dp),
               shape = RoundedCornerShape(50.dp),
               backgroundColor = Color.Black
           ) {
               Icon(imageVector = Icons.Default.Person, contentDescription = null,tint=Color.White)
           }
           Spacer(modifier = Modifier.height(8.dp))
           Text("Augustine Victor", color = Color.Black, fontSize = 20.sp)
           Text(text = "Mobile Developer",color = Color.DarkGray,
               fontSize = 15.sp)
           Spacer(modifier = Modifier.height(50.dp))
           Text("USD",color = Color.Gray, fontWeight = FontWeight.Bold, fontSize = 20.sp)
           Spacer(modifier = Modifier.height(10.dp))

           Text("16,000.00",color = Color.Blue, fontWeight = FontWeight.Bold, fontSize = 30.sp)
           Spacer(modifier = Modifier.height(40.dp))
           Button(onClick = { /*TODO*/ },
modifier = Modifier.fillMaxWidth().height(60.dp)
    .padding(horizontal = 16.dp)
    ) {
    Text("Send Money", fontWeight = FontWeight.W800)
}
           Spacer(modifier = Modifier.height(40.dp))
           Card(
    //shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp),
    backgroundColor = Color.Black,
    modifier = Modifier
        .fillMaxSize()
) {
Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Spacer(modifier = Modifier.height(8.dp))
Card(
    modifier = Modifier.height(6.dp).width(50.dp),
    backgroundColor = Color.Gray){}
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BuildKeypad("1"){}
        BuildKeypad("2"){}
        BuildKeypad("3") {}}
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BuildKeypad("4"){}
        BuildKeypad("5"){}
        BuildKeypad("6"){} }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BuildKeypad("7"){}
        BuildKeypad("8"){}
        BuildKeypad("9"){}
    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BuildKeypad("."){}
        BuildKeypad("0"){}
        BuildKeypad("",true) {}
    }
}
}
       }
   }
}

@Composable
fun BuildKeypad(text:String,isVisible:Boolean=false,onClick:()->Unit){
    val textStyle= TextStyle(color = Color.White,
        fontWeight = FontWeight.Bold, fontSize = 30.sp)
    Button(onClick = onClick,
        modifier = Modifier
            .clip(CircleShape)
            .height(60.dp)
            .width(60.dp),
colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        ) {
        if (isVisible)
            Icon(imageVector = Icons.Default.Clear,
                contentDescription = null, tint = Color.White,
                modifier = Modifier.height(50.dp))
        else
            null
        Text(text, style = textStyle)
    }
}

@Preview
@Composable
fun Screen5Prev(){
Screen5()
}