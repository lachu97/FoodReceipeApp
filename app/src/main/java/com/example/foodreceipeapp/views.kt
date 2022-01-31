package com.example.foodreceipeapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun toppart() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_filter_list_24),
            contentDescription = "Filter Icons",
            tint = Color.DarkGray,
            modifier = Modifier
                .size(42.dp)
                .padding(5.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_search_24),
            contentDescription = "Search Icons",
            tint = Color.DarkGray,
            modifier = Modifier
                .size(42.dp)
                .padding(5.dp)
        )

    }
}

@Composable
fun description() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(
            text = "Delicious Salads",
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.width(550.dp)
        )
        Text(
            text = "We made fresh and Healthy foods",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.width(250.dp),
            fontWeight = FontWeight.Medium,
        )
    }

}

@Composable
fun Chips(name: String) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .height(52.dp)
            .width(90.dp),
        shape = RoundedCornerShape(32.dp),
        border = BorderStroke(1.dp, color = Color.LightGray),
        backgroundColor = Color.Transparent,
        elevation = 8.dp,
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            name.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.h3,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 21.sp,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                )
            }

        }

    }

}

@Composable
fun Chipgrp(list: List<String>) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,

        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically

    ) {
        LazyRow(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(0.8f)
        ) {
            itemsIndexed(list) { _, it ->
                Chips(name = it)
            }
        }
        Icon(
            painter = painterResource(id = R.drawable.filter),
            contentDescription = "Filter", tint = Color.Black,
            modifier = Modifier
                .size(52.dp)
                .padding(5.dp),
        )

    }
}