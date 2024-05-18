package com.dhnph34455.fpt.edu.kotlinjetpackcompose

import android.os.Bundle
import android.os.Message
import android.os.Messenger
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//chạy trên máy thật
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Greeting(name = "Đinh Hoài Nam - PH34455")
//            Click("Chinh Dep zai")
            Count()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
            .padding(0.dp, 16.dp)
            .fillMaxWidth(),
        color = Color.Red,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
    )
}

//máy ảo
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
//    Greeting(name = "Đinh Hoài Nam - PH34455")
//    GetTextTitle("Đinh Hoài Nam")
//    Click("Chinh dep trai")
    Count()
}
@Composable
fun GetTextTitle(title: String, modifier: Modifier = Modifier){
    Text(
        text = title,
        fontSize = 20.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = modifier
            .padding(0.dp, 16.dp)
            .fillMaxWidth(),
    )
}

@Composable
fun MessageCard(msg: String){
    Text(
        text = msg,
        modifier = Modifier
            .padding(0.dp, 1.dp)
            .fillMaxWidth(),
        color = Color.Gray,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Click (msg : String){
    var text by remember {
        mutableStateOf(msg)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MessageCard(msg = text)
        Button(onClick = {text = "Quynh ăn cứt"}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
            Text("Mở")
        }
    }
}

@Composable
fun Count (){
    var CountMess by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MessageCard("Toi da click ${CountMess} lan")
        Button(onClick = {CountMess++}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
            Text("Mở")
        }
    }
}