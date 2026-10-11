package com.gpt.androidmiroir2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CameraPreviewScreen()
        }
    }
}

@Composable
private fun CameraPreviewScreen() {
    Surface {
        // CameraX preview will be integrated here.
    }
}
