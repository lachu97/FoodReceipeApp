package com.example.foodreceipeapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodreceipeapp.R

@Composable
fun top() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_back_ios_24),
            contentDescription = "dsfh",
            tint = Color.Black,
            modifier = Modifier
                .size(36.dp)
                .padding(5.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_down_24),
            contentDescription = "dsfh",
            tint = Color.Black,
            modifier = Modifier
                .size(36.dp)
                .padding(5.dp)
        )

    }
}

@Composable
fun imagesection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.detailscreen),
            contentDescription = "kjgh",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .fillMaxSize()
        )
    }
}

@Composable
fun head() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.padding(5.dp)) {
            Text(
                text = "Mediterranean", fontSize = 18.sp,
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Quinoa Salad", fontSize = 30.sp,
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.ExtraBold
            )
        }
        addsub()

    }
}

@Composable
fun addsub() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_add_circle_24),
            contentDescription = "adddd",
            modifier = Modifier
                .size(24.dp)
                .padding(1.dp)
        )
        Text(
            text = "1",
            modifier = Modifier.align(Alignment.CenterVertically),
            fontSize = 21.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_add_circle_24),
            modifier = Modifier
                .size(24.dp)
                .padding(1.dp), contentDescription = "adddd"
        )
    }
}

@Composable
fun describe() {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Deliciously made simply with fresh cucumber, red bell pepper, red onion, chickpeas, fresh parsley and a garlicky olive oil and lemon dressing.",
            maxLines = 4,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Start,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.body2,
            letterSpacing = 1.sp
        )
    }
}

@Composable
fun bottompart() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {
        Row {
            Text(
                text = "Delivery Time",
                fontSize = 17.sp,
                fontWeight = FontWeight.Light,
                style = MaterialTheme.typography.body1
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_lock_clock_24),
                contentDescription = "dfkjhlk", modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(
                text = "25 Mins",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.body1
            )
        }
        Text(
            text = "Total Price",
            fontSize = 19.sp,
            fontWeight = FontWeight.Light,
            style = MaterialTheme.typography.body1
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(
            text = "$ 25.00",
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.body1
        )

    }
}