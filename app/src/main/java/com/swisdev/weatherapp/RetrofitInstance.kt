package com.swisdev.weatherapp

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitInstance {

    //retrofit instance
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/data/2.5/weather/")
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()
}