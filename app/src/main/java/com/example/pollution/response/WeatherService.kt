package com.example.pollution.response

import com.example.pollution.data.APIData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("airqualityforecast/0.1/")
    fun getWeather(@Query("lat") lat: Double,
                   @Query("lon") lon: Double): Call<APIData>
}
