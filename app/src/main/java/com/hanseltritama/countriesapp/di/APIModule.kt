package com.hanseltritama.countriesapp.di

import com.hanseltritama.countriesapp.model.CountriesAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

// indicate that this class is a module
@Module
class APIModule {

    private val BASE_URL = "https://raw.githubusercontent.com"

    @Provides
    fun provideCountriesApi(): CountriesAPI {

        return Retrofit.Builder() // creates the framework from Retrofit
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) // transform JSON into GSON or Kotlin code
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // transform GSON to Observable
            .build() // build retrofit system
            .create(CountriesAPI::class.java) // return type

    }

}