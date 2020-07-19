package com.hanseltritama.countriesapp.model

import retrofit2.http.GET

// contains functions to retrieve information
interface CountriesAPI {

    @GET("hanselgunawan/countries-android-app/master/countries/countries.json")
    suspend fun getCountries(): List<Country>

}