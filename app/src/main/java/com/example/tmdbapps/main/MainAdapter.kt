package com.example.tmdbapps.main

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdbapps.model.Movie
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import java.util.*

class MainAdapter(private val result: List<Movie>, private val listener: (Movie)->Unit):RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
    }

    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
    }

}
class MovieUi:AnkoComponent<ViewGroup>{
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui){

        }
    }
}
class MovieViewHolder(view: View):RecyclerView.ViewHolder(view){
    fun bindItem(movies:Movie, listener: (Movie) -> Unit){

    }
}