package com.hanseltritama.countriesapp.model

import com.hanseltritama.countriesapp.di.DaggerAPIComponent
import io.reactivex.Single
import javax.inject.Inject

// This service is used to retrieve information from backend
class CountriesService {

    @Inject
    lateinit var api: CountriesAPI

    init {
        DaggerAPIComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}