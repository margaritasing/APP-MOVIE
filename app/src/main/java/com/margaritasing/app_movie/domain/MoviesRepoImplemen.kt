package com.margaritasing.app_movie.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.margaritasing.app_movie.domain.model.Movie

class MoviesRepoImplemen: MoviesRepo {

    private val movies = MutableLiveData<List<Movie>>(
        mutableListOf(
            Movie("Superman", "Accion", "2012", "https://www.tonica.la/__export/1593024463060/sites/debate/img/2020/06/24/henry-cavill-superman-portada.jpg_423682103.jpg")
        )
    )
    override fun getMovies(): LiveData<List<Movie>> {
       return movies
    }

}