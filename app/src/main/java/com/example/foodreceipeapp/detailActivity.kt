package com.example.foodreceipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodreceipeapp.ui.theme.*

class detailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodReceipeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        top()
                        Spacer(modifier = Modifier.padding(1.dp))
                        imagesection()
                        Spacer(modifier = Modifier.padding(1.dp))
                        head()
                        describe()
                        bottompart()
                    }
                }


            }
        }
    }
}