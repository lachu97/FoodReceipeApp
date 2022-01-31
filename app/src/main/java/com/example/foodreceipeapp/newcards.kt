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
fun board() {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .height(240.dp)
            .width(140.dp),
        elevation = 8.dp,
        backgroundColor = colorResource(id = R.color.mygray),
        border = BorderStroke(2.dp, color = colorResource(id = R.color.mygray)),
        shape = RoundedCornerShape(48.dp)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.salad),
                contentDescription = "Image 2",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .padding(5.dp)
                    .size(100.dp)
            )
            Text(
                text = "Chicken Salad",
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 17.sp,
            )
            Spacer(modifier = Modifier.padding(1.dp))
            Text(
                text = "Chicken with Avacado",
                style = MaterialTheme.typography.body1,
                fontWeight = FontWeight.Light,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
            )
            Spacer(modifier = Modifier.padding(1.dp))
            Text(
                text = "$ 32.00",
                style = MaterialTheme.typography.h2,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 10.sp,
            )
            Spacer(modifier = Modifier.padding(1.dp))
            Icon(painter = painterResource(id = R.drawable.ic_add_circle_24), contentDescription = "Add",
            tint = Color.Black)
        }
    }
}

@Composable
fun maintoload() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        board()
        board()
    }
}