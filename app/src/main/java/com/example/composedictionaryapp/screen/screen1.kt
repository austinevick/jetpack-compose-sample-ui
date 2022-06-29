package com.example.composedictionaryapp
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen1() {
    return Scaffold(

    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .verticalScroll(ScrollState(0))
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier.clip(CircleShape.copy(CornerSize(30.dp))),
                    backgroundColor = Color.Blue,
                    content = {
                        Icon(
                            imageVector = Icons.Default.Person, contentDescription = null,
                            modifier = Modifier.padding(8.dp), tint = Color.White)})
                Text("Dashboard", fontSize = 22.sp, fontWeight = FontWeight.W800)
                Icon(
                    imageVector = Icons.Default.Search, contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(shape = RoundedCornerShape(10.dp),
                backgroundColor = Color(0xff2b2e3c),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                content = {
                    Column(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxSize(),
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Card balance", color = Color.Gray, fontSize = 17.sp)
                            Icon(imageVector = Icons.Default.Menu, tint = Color.White, contentDescription = null)
                        }
                        Text(text = "$5000", color = Color.White, fontSize = 25.sp)
                        Spacer(modifier = Modifier.height(40.dp))
                        Text(
                            text = "5412 6541 8569 3256", color = Color.LightGray,
                            fontSize = 18.sp
                        ) }})
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Transactions", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null) }
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")
            TransactionList(title = "You sent money to John", date = "8/05/2022", time = "2:00PM")

        }
    }
}
@Composable
fun TransactionList(title:String,date:String,time:String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .size(45.dp),
            backgroundColor = Color.Blue,
        ){}
        Spacer(modifier = Modifier.width(10.dp))
        Column() {
            Text(text = title, fontSize = 14.sp, fontWeight = FontWeight.W700)
            Text(text = date,color = Color.DarkGray, fontWeight = FontWeight.W600)
        }
        Spacer(modifier = Modifier.width(60.dp))
        Text(time, color = Color.DarkGray, fontWeight = FontWeight.W700)

    }
}






@Composable
@Preview
fun P() {
    Screen1()
}
