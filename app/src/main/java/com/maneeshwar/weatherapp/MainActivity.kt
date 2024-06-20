package com.maneeshwar.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.maneeshwar.weatherapp.api.WeatherViewModel
import com.maneeshwar.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val weatherviewmodel=ViewModelProvider(this)[WeatherViewModel::class.java]
        setContent {
            Surface (modifier=Modifier.fillMaxSize(), color = Color.Magenta){
                WeatherPage(WeatherViewModel())
            }
        }
    }
}
