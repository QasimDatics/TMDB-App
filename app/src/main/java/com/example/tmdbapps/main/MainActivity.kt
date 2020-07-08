package com.example.tmdbapps.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdbapps.R
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var listMovie:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayout{
            lparams(width= matchParent, height = wrapContent)
            orientation=LinearLayout.VERTICAL
            padding=dip(16)

            listMovie = recyclerView{
                lparams(width= matchParent,height = wrapContent)
                layoutManager=GridLayoutManager(ctx,2)
            }
        }
    }
}
