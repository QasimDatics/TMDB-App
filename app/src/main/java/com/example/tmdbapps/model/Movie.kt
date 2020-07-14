package com.example.tmdbapps.model

import android.icu.text.CaseMap
import com.google.gson.annotations.SerializedName

data class Movie (
    val id:String,
    val title:String,
    val overview:String,
    @SerializedName("poster_path")
)