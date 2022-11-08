package com.izo.weatherapp.model

import com.google.gson.annotations.SerializedName

data class Weather(

	@field:SerializedName("temperature")
	val temperature: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("forecast")
	val forecast: List<ForecastItem?>? = null,

	@field:SerializedName("wind")
	val wind: String? = null
)

data class ForecastItem(

	@field:SerializedName("temperature")
	val temperature: String? = null,

	@field:SerializedName("day")
	val day: Int? = null,

	@field:SerializedName("wind")
	val wind: String? = null
)
