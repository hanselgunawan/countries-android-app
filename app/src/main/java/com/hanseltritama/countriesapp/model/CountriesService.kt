package com.hanseltritama.countriesapp.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// This service is used to retrieve information from backend
class CountriesService {
    companion object {
        val retrofit: CountriesAPI = Retrofit.Builder() // creates the framework from Retrofit
            .baseUrl("https://raw.githubusercontent.com")
            .addConverterFactory(GsonConverterFactory.create()) // transform JSON into GSON or Kotlin code
            .build() // build retrofit system
            .create(CountriesAPI::class.java) // return type
    }
}