package com.hanseltritama.countriesapp.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

// This service is used to retrieve information from backend
class CountriesService {

    private val BASE_URL = "https://raw.githubusercontent.com"
    private val api: CountriesAPI

    init {
        api = Retrofit.Builder() // creates the framework from Retrofit
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) // transform JSON into GSON or Kotlin code
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // transform GSON to Observable
            .build() // build retrofit system
            .create(CountriesAPI::class.java) // return type
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}