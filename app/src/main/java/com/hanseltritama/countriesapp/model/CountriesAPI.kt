package com.hanseltritama.countriesapp.model

import io.reactivex.Single
import retrofit2.http.GET

// contains functions to retrieve information
interface CountriesAPI {

    @GET("hanselgunawan/countries-android-app/master/countries/countries.json")
    fun getCountries(): Single<List<Country>>

}