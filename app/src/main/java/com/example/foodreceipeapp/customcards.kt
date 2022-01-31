package com.example.foodreceipeapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CCArds() {
    Row(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box() {

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .height(100.dp)
                    .width(420.dp)
                    .align(Alignment.Center),
                shape = RoundedCornerShape(64.dp),
                border = BorderStroke(1.dp, color = Color.LightGray),
                backgroundColor = colorResource(id = R.color.mygray),
                elevation = 10.dp,
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Spacer(modifier = Modifier.padding(20.dp))
                    Column() {
                        Text(
                            text = "Chicken Salad",
                            style = MaterialTheme.typography.h3,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            fontSize = 21.sp,
                        )
                        Spacer(modifier = Modifier.padding(3.dp))
                        Text(
                            text = "Chicken with Avacado",
                            style = MaterialTheme.typography.body1,
                            fontWeight = FontWeight.Light,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            fontSize = 17.sp,
                        )
                        Spacer(modifier = Modifier.padding(3.dp))
                        Text(
                            text = "$ 32.00",
                            style = MaterialTheme.typography.h2,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            fontSize = 19.sp,
                        )
                    }
//                    Spacer(modifier = Modifier.padding(10.dp))
//                    Icon(
//                        painter = painterResource(id = R.drawable.ic_add_circle_24),
//                        contentDescription = "Add",
//                        tint = Color.Black,
//                        modifier = Modifier
//                            .size(24.dp)
//                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.salad1),
                contentDescription = "Images",
                modifier = Modifier
                    .padding(5.dp)
                    .size(134.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }


    }

}