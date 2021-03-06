package com.hanseltritama.countriesapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hanseltritama.countriesapp.R
import com.hanseltritama.countriesapp.model.Country
import com.hanseltritama.countriesapp.util.getProgressDrawable
import com.hanseltritama.countriesapp.util.loadImage
import kotlinx.android.synthetic.main.item_country.view.*

class CountryListAdapter(var countries: ArrayList<Country>) : RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    // this function is needed for MainActivity to access
    fun updateCountries(newCountries: List<Country>) {
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CountryViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imageView = view.imageView
        private val countryName = view.name
        private val countryCapital = view.capital

        // to display progress bar inside the image when it's being loaded
        private val progressDrawable = getProgressDrawable(view.context)

        fun bind(country: Country) {

            countryName.text = country.countryName
            countryCapital.text = country.capitalName
            imageView.loadImage(country.flag, progressDrawable)

        }

    }
}