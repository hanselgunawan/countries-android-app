package com.hanseltritama.countriesapp.model

class CountriesRepository {

    var client: CountriesAPI = CountriesService.retrofit

    suspend fun getCountries() = client.getCountries()

}