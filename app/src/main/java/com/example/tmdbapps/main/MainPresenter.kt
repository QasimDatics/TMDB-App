package com.example.tmdbapps.main

import com.example.tmdbapps.model.MovieResponse
import com.example.tmdbapps.network.ApiRepository
import com.example.tmdbapps.network.TMDBApi
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(private val view: MainView, private val apiRepository: ApiRepository,private val gson: Gson) {
    fun getMovieList(){
        doAsync {
            val data=gson.fromJson(apiRepository.doRequest(TMDBApi.getMovie()),
            MovieResponse::class.java)
            uiThread {
                view.showMovieList(data.results)
            }
        }
    }
}