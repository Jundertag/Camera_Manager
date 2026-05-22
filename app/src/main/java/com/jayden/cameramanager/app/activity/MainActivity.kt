package com.jayden.cameramanager.app.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.jayden.cameramanager.feature.cameralist.ui.CameraListScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Scaffold(

            ) { padding ->
                CameraListScreen(
                    modifier = Modifier.padding(padding)
                )
            }
        }
    }
}