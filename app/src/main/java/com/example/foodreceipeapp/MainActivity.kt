package com.example.foodreceipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodreceipeapp.ui.theme.FoodReceipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val stringlist= listOf<String>("Salads","Soups","Grilled")
        setContent {
            FoodReceipeAppTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp)
                    ) {
                        toppart()
                        Spacer(modifier = Modifier.padding(10.dp))
                        description()
                        Spacer(modifier = Modifier.padding(10.dp))
                        Chipgrp(list = stringlist)
                        Spacer(modifier = Modifier.padding(10.dp))
                        CCArds()
                    }
                }
            }
        }
    }
}
