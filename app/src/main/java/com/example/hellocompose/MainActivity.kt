package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Greeting(
                        name = "Yifei Bao",
                        email = "baoyifei@bu.edu"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, email: String) {
    var message by remember { mutableStateOf("Hello, my name is $name! My email is $email") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = message)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { message = "Message changed! Nice to meet you." }) {
            Text("Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloComposeTheme {
        Greeting("Yifei Bao", "baoyifei@bu.edu")
    }
}