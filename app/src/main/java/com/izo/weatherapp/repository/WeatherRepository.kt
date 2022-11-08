package com.izo.weatherapp.repository

import com.izo.weatherapp.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {

    suspend fun getWeather() = apiService.getWeather()

}