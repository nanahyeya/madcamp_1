package com.example.madcamp2024wjhnh.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TravelViewModel(private val repository: TravelRepository) : ViewModel() {
    val travelList = repository.getAllTravels().asLiveData() // Flow를 LiveData로 변환

    fun loadTravels() {
        viewModelScope.launch {
            travelList.postValue(repository.getAllTravels())
        }
    }

    fun addTravel(travel: Travel) {
        viewModelScope.launch {
            repository.insertTravel(travel)
            loadTravels() // 업데이트된 목록 로드
        }
    }
}