package com.example.tmdbapps.network
import com.example.tmdbapps.BuildConfig.API_KEY
import com.example.tmdbapps.BuildConfig.BASE_URL


object TMDBApi {

    fun getMovie():String{
        return BASE_URL + API_KEY
    }
}