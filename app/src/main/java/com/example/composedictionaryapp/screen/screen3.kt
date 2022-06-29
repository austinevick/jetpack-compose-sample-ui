package com.example.composedictionaryapp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.w3c.dom.Text

@Composable
fun LoginScreen(navController: NavController){
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
   return Scaffold(
        content = {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.verticalScroll(rememberScrollState())
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
                        contentDescription = "")
                    }
                )
                OutlinedTextField(value = password, onValueChange = {value -> password=value},
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .background(color = Color.Transparent),
                    textStyle = TextStyle(),
                    label = { Text(text = "Password")},
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock,
                        contentDescription = "")})
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    onClick = {
navController.navigate(Screens.HomePage.route)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(58.dp)
                        .padding(horizontal = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(text = "LOGIN", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    )
}