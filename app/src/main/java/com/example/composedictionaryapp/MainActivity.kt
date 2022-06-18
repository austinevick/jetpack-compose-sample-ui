package com.example.composedictionaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent {
           var username by remember { mutableStateOf(TextFieldValue(""))}
           var password by remember { mutableStateOf(TextFieldValue(""))}

           Scaffold(
              content = {
                 Column(
verticalArrangement = Arrangement.Center
                 ) {
                     Spacer(modifier = Modifier.height(25.dp))
                     Text(text = "Welcome, login to continue",
                         modifier = Modifier.padding(horizontal = 16.dp),
                         fontSize = 18.sp,
                         fontWeight = FontWeight.Bold,
                         textAlign = TextAlign.Center)

                     Spacer(modifier = Modifier.height(20.dp))
Image(painter = painterResource(id = R.drawable.noodles),
    contentDescription = "", modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .clip(RoundedCornerShape(8.dp))
        .height(200.dp), contentScale = ContentScale.FillWidth)
                     Spacer(modifier = Modifier.height(28.dp))
                     OutlinedTextField(value = username, onValueChange = {value -> username=value},
                         modifier = Modifier
                             .padding(10.dp)
                             .fillMaxWidth(),
                         label = { Text(text = "Username")},
                         leadingIcon = { Icon(imageVector = Icons.Default.Person,
                             contentDescription = "")}
                     )
                     OutlinedTextField(value = password, onValueChange = {value -> password=value},
                         modifier = Modifier
                             .padding(10.dp)
                             .fillMaxWidth()
                             .background(color = Color.Transparent),
                         textStyle = TextStyle(),
                         label = { Text(text = "Password")},
                         leadingIcon = { Icon(imageVector = Icons.Default.Lock,
                             contentDescription = "")}
                         )
                     Spacer(modifier = Modifier.height(40.dp))

                     Button(onClick = { /*TODO*/ },
                     modifier = Modifier
                         .fillMaxWidth()
                         .height(55.dp)
                         .padding(horizontal = 10.dp),
                         shape = RoundedCornerShape(10.dp),
                         ) {
                         Text(text = "LOGIN", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                     }

                 }
              }
          )


           }
       }
}
