package com.margaritasing.app_movie.domain

import com.margaritasing.app_movie.domain.model.Movie


interface MoviesRepo {
    fun getMovies() : List<Movie> //Metodo que devolvera una lista de movies


}