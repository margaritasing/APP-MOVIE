package com.margaritasing.app_movie.presentacion.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.margaritasing.app_movie.domain.model.Movie

class MovieViewModel: ViewModel() {
    private val movies = MutableLiveData<List<Movie>>()
}