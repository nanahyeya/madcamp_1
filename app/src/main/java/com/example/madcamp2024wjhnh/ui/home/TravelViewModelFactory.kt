package com.example.madcamp2024wjhnh.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TravelViewModelFactory(private val repository: TravelRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TravelViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TravelViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}