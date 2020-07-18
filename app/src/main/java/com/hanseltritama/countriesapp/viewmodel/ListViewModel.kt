package com.hanseltritama.countriesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hanseltritama.countriesapp.model.CountriesService
import com.hanseltritama.countriesapp.model.Country
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class ListViewModel : ViewModel() {

    private val countriesService = CountriesService()

    // clear connection when ViewModel is closed
    private val disposable = CompositeDisposable()

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
        loading.value = true
        disposable.add(
            countriesService.getCountries() // call countries service
            .subscribeOn(Schedulers.newThread()) // run observable on background thread
            .observeOn(AndroidSchedulers.mainThread()) // the thread that the user sees
            .subscribeWith(object: DisposableSingleObserver<List<Country>>() {
                override fun onSuccess(value: List<Country>?) {
                    countries.value = value
                    countryLoadError.value = false
                    loading.value = false
                }

                override fun onError(e: Throwable?) {
                    countryLoadError.value = true
                    loading.value = false
                }

            })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }

}