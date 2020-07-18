package com.hanseltritama.countriesapp.model

import io.reactivex.Single
import retrofit2.http.GET

// contains functions to retrieve information
interface CountriesAPI {

    @GET("DevTides/countries/master/countriesV2.json")
    fun getCountries(): Single<List<Country>>

}