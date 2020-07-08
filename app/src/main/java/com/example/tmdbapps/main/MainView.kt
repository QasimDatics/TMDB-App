package com.example.tmdbapps.main

import com.example.tmdbapps.model.Movie

interface MainView {
    fun showMovieList(data: List<Movie>)
}