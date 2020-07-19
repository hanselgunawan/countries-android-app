package com.hanseltritama.countriesapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.hanseltritama.countriesapp.model.CountriesRepository
import com.hanseltritama.countriesapp.model.Country
import kotlinx.coroutines.Dispatchers

class ListViewModel : ViewModel() {

    private val repository: CountriesRepository = CountriesRepository()
    val loading = MutableLiveData<Boolean>()
    val countryLoadError = MutableLiveData<Boolean>()

    val mCountry: LiveData<List<Country>> = liveData(Dispatchers.IO) {
        val retrievedCountry = repository.getCountries()
        emit(retrievedCountry)
        loading.postValue(false)
        countryLoadError.postValue(false)
    }

}