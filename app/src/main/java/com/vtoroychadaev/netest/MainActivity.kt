package com.vtoroychadaev.netest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.vtoroychadaev.netest.ui.theme.NetestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NetestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Row {
                        Greeting(
                            name = "User",
                            modifier = Modifier.padding(innerPadding)
                        )

                        Image (
                            painter = painterResource(R.drawable.android_robot_green_png_photos),
                            contentDescription = "The bot picture",
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface (color = MaterialTheme.colorScheme.primary) {
        Text(
            text = "Hello, $name!",
            modifier = modifier.padding(1.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NetestTheme {
        Greeting("Android")
    }
}
