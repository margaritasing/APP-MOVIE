package com.margaritasing.app_movie.domain

import androidx.lifecycle.LiveData
import com.margaritasing.app_movie.domain.model.Movie


interface MoviesRepo {
    fun getMovies() : LiveData<List<Movie>> //Metodo que devolvera una lista de movies


}