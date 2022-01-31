package com.example.foodreceipeapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CCArds() {
    Row(
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .height(124.dp)
                .width(360.dp),
            shape = RoundedCornerShape(78.dp),
            border = BorderStroke(1.dp, color = Color.LightGray),
            backgroundColor = Color.LightGray,
            elevation = 8.dp,
        ) {
            Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
                Image(painter = painterResource(id = R.drawable.salad),
                    contentDescription = "Images",
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.padding(20.dp))
                Column() {
                    Text(text = "lkdglkds")
                    Text(text = "lkdglkds")
                    Text(text = "lkdglkds")
                    Text(text = "lkdglkds")
                }
            }
            }

    }

}