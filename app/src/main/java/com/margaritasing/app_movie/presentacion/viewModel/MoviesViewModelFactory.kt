package com.margaritasing.app_movie.presentacion.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.margaritasing.app_movie.domain.MoviesRepo

class MoviesViewModelFactory(private val moviesRepo: MoviesRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return modelClass.getConstructor(MoviesRepo::class.java).newInstance(moviesRepo)
    }
}