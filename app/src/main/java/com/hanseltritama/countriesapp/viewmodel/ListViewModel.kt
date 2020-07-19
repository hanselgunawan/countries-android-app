package com.hanseltritama.countriesapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.hanseltritama.countriesapp.model.CountriesRepository
import com.hanseltritama.countriesapp.model.CountriesService
import com.hanseltritama.countriesapp.model.Country
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
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