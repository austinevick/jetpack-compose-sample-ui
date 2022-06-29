package com.example.composedictionaryapp.screen
import com.example.composedictionaryapp.data.items
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen4(){

    LazyColumn(
            content = {
                item {
                    items.forEach { it ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp)
                                .padding(10.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = it.images),
                                contentDescription = null,
                                contentScale = ContentScale.FillWidth)
                            Box(
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    text = it.title,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(60.dp)
                                        .background(
                                            color =
                                            Color.Black.copy(0.8f)
                                        )
                                        .padding(top = 15.dp),
                                    textAlign = TextAlign.Center,
                                    color = Color.White, fontSize = 18.sp
                                )
                            }
                        }
                    }
                }
            })

}
@Preview
@Composable
fun Screen4Pre(){
    Screen4()
}