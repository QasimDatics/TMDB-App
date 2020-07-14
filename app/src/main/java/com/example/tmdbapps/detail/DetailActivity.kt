package com.example.tmdbapps.detail

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.tmdbapps.BuildConfig.URL_POSTER
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*
import org.w3c.dom.Text

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class DetailActivity : AppCompatActivity() {

    private var titleMovie:String=""
    private var posterMovie:String=""
    private var overviewMovie:String=""

    private lateinit var poster:ImageView
    private lateinit var title: TextView
    private lateinit var overview:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val i=intent
        titleMovie = i.getStringExtra("TITLE")
        overviewMovie = i.getStringExtra("OVERVIEW")
        posterMovie = i.getStringExtra("POSTER")

        title.text=titleMovie
        overview.text=overviewMovie
        Picasso.get().load(URL_POSTER + posterMovie).into(poster)
    }
}
