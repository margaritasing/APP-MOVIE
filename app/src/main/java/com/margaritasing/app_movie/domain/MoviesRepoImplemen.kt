package com.margaritasing.app_movie.domain

import com.margaritasing.app_movie.domain.model.Movie

class MoviesRepoImplemen: MoviesRepo {
    override fun getMovies(): List<Movie> {
        return listOf(
            Movie("Superman", "Accion", "2012", poster = "https://www.tonica.la/__export/1593024463060/sites/debate/img/2020/06/24/henry-cavill-superman-portada.jpg_423682103.jpg")
        )
    }

}