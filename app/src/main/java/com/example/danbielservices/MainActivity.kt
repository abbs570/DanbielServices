package com.example.danbielservices

import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.danbielservices.ui.theme.DanbielServicesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //        Toggle Button
            val tg = findViewById<ToggleButton>(R.id.clockInOut)
            tg.setOnCheckedChangeListener{ _, isChecked ->
                Toast.makeText(this, if(isChecked)"You are clocked in" else "You are clocked out", Toast.LENGTH_SHORT).show()
            }


        }

    }



