package com.margaritasing.app_movie.presentacion.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.margaritasing.app_movie.domain.MoviesRepo
import com.margaritasing.app_movie.domain.model.Movie

class MovieViewModel(private val moviesRepo: MoviesRepo): ViewModel() {
    private val movies = MutableLiveData<List<Movie>>()
    fun getMovies(): LiveData<List<Movie>>{
        return moviesRepo.getMovies()
    }
}