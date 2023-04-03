package com.baruapps.myappcompose.ui.files

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IU01 (navegationComponet: (String) -> Unit ){
    var myText by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(),Arrangement.Center,Alignment.CenterHorizontally) {
        Text(text = "ANDROID COMPOSE", modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp), textAlign = TextAlign.Center, fontSize = 20.sp, fontFamily = FontFamily.Serif)
        TextField(value = myText, onValueChange = {myText= it}, modifier = Modifier.fillMaxWidth().padding(20.dp))
        Button(onClick = {navegationComponet(myText)}, modifier = Modifier.fillMaxWidth().padding(20.dp)) {
            Text(text = "Continuar")
        }
    }
}