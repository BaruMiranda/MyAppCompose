package com.baruapps.myappcompose.ui.files

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun IU02 (myText : String){
    Column(modifier = Modifier.fillMaxSize().background(Color.Gray)) {
        Text(text = "soy $myText")
    }
}