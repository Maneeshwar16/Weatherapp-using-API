package com.maneeshwar.weatherapp.api


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherModel(
    @Json(name = "current")
    val current: Current,
    @Json(name = "location")
    val location: Location
)