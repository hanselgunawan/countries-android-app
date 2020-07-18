package com.hanseltritama.countriesapp.di

import com.hanseltritama.countriesapp.model.CountriesService
import dagger.Component

@Component(modules = [APIModule::class])
interface APIComponent {

    fun inject(service: CountriesService)
}