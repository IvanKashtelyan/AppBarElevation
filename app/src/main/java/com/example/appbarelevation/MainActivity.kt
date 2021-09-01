package com.example.appbarelevation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appbarelevation.ui.theme.AppBarElevationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBarElevationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column{
        TopAppBar(
            backgroundColor = Color.White
        ) {
            Text(text = "MyAppBar")
        }
        Column(Modifier.verticalScroll(rememberScrollState())) {
            for (i in 0..10){
                CardItem()
            }
        }
    }
}

@Composable
fun CardItem() {
    Card(
        Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(16.dp)) {
        Text(text = "CardItem", textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppBarElevationTheme {
        Greeting()
    }
}