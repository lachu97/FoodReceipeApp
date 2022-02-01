package com.example.foodreceipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodreceipeapp.ui.theme.FoodReceipeAppTheme
import com.example.foodreceipeapp.ui.theme.bottombar

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val stringlist = listOf<String>("Salads", "Soups", "Grilled")
        setContent {
            FoodReceipeAppTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp),

                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        toppart()
                        Spacer(modifier = Modifier.padding(1.dp))
                        description()
                        Spacer(modifier = Modifier.padding(1.dp))
                        Chipgrp(list = stringlist)
                        Spacer(modifier = Modifier.padding(1.dp))
                        CCArds()
                        Spacer(modifier = Modifier.padding(1.dp))
                        maintoload()
                        Spacer(modifier = Modifier.padding(1.dp))
                        bottombar(onclick = {
                            startActivity(
                                Intent(this@MainActivity, detailActivity::class.java)
                            )
                        })
                    }
                }
            }
        }
    }
}
