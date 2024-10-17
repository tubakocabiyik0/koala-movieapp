package org.example.koala.viewModels

import androidx.lifecycle.ViewModel
import org.example.koala.model.Movie
import org.example.koala.service.ApiService

class HomePageViewModel(private val apiService: ApiService) : ViewModel() {

    suspend fun loadPopulerOfWeeks(): Movie {
        return apiService.fetchPopulerOfWeeks()
    }
}