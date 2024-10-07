package com.ravemaster.composethreepostcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ravemaster.composethreepostcard.ui.theme.ComposeThreePostCardTheme
import java.util.concurrent.Flow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeThreePostCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.Black)){
        Box(modifier = modifier.fillMaxSize().padding(30.dp),
            contentAlignment = Alignment.Center){
            PostCardComposable(
                image = R.drawable.sf90_spider,
                title = "Cereal killer",
                text = "I am a serial killer my friend, I will kill your cereal. I am a serial killer my friend, I will kill your cereal. I am a serial killer my friend, I will kill your cereal. I am a serial killer my friend, I will kill your cereal. I am a serial killer my friend, I will kill your cereal. ",
                publisher = Publisher("Killer of cereals",R.drawable.profile_img,"Cereal killer")
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeThreePostCardTheme {
        Greeting()
    }
}