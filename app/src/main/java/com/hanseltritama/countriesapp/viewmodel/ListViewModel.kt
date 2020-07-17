package com.hanseltritama.countriesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hanseltritama.countriesapp.model.Country

class ListViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()

    // error handling when loading the data
    val countryLoadError = MutableLiveData<Boolean>()

    // check if ViewModel is loading the data
    val loading = MutableLiveData<Boolean>()

    fun refresh() {

        fetchCountries()

    }

    // we don't want to expose the function that does the functionality
    // this is the logic where refresh actually happens
    private fun fetchCountries() {

        val mockData = listOf(
            Country("CountryA"),
            Country("CountryB"),
            Country("CountryC"),
            Country("CountryD"),
            Country("CountryE"),
            Country("CountryF"),
            Country("CountryG"),
            Country("CountryH"),
            Country("CountryI"),
            Country("CountryJ")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }

}