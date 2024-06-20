package com.maneeshwar.weatherapp.api
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

object RetrofitInstance {
    private const val baseUrl="https://api.weatherapi.com"
    private fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    }
    val weatherApi:WeatherApi= getInstance().create(WeatherApi::class.java)
}