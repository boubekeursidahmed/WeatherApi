package com.swisdev.weatherapp

import retrofit2.Call
import retrofit2.http.GET

interface WeatherService {

    @GET("?lat=36.700985&lon=2.808855&appid=007cd302fd508c85e9e7b3edff33f963")
    fun getWeather(): Call<String>
}