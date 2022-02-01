package com.example.foodreceipeapp.ui.theme

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodreceipeapp.R

@ExperimentalMaterialApi
@Composable
fun bottombar(onclick:() -> Unit) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .width(320.dp)
            .height(78.dp),
        elevation = 10.dp,
        shape = RoundedCornerShape(36.dp),
        backgroundColor = Color.Black,
        onClick = onclick
        ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.home),
                contentDescription ="dlf",
                tint = Color.White,
                modifier = Modifier.size(24.dp).clickable {

                }
            )
            Icon(
                painter = painterResource(id = R.drawable.folder1),
                contentDescription ="dlf",
                tint = Color.White,
                modifier = Modifier.size(24.dp)

            )
            Icon(
                painter = painterResource(id = R.drawable.speech),
                contentDescription ="dlf",
                tint = Color.White,
                modifier = Modifier.size(24.dp)

            )
            Icon(
                painter = painterResource(id = R.drawable.user),
                contentDescription ="dlf",
                tint = Color.White,
                modifier = Modifier.size(24.dp)

            )


        }

    }
}