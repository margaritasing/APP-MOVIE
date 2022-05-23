package com.margaritasing.app_movie.presentacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.margaritasing.app_movie.R
import com.margaritasing.app_movie.domain.MoviesRepoImplemen
import com.margaritasing.app_movie.presentacion.viewModel.MovieViewModel
import com.margaritasing.app_movie.presentacion.viewModel.MoviesViewModelFactory

class MainActivity : AppCompatActivity() {
    private val movieViewModel by lazy {
        ViewModelProvider(this, MoviesViewModelFactory(MoviesRepoImplemen())).get(MovieViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieViewModel.getMovies().observe(this, Observer { movies ->
            println(movies)
        })
    }
}