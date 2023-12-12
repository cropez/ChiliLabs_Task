package com.example.chililabs_task.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import network.GifItem
import repository.GifRepository
import javax.inject.Inject

class GifViewModel @Inject constructor(private val repository: GifRepository) : ViewModel() {

    private val _gifList = MutableLiveData<List<GifItem>>()
    val gifList: LiveData<List<GifItem>> get() = _gifList

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    private var offset = 0

    fun searchGifs(query: String) {
        viewModelScope.launch {
            try {
                _isLoading.value = true
                val result = repository.searchGifs(query, offset)
                _gifList.value = result.data
                offset += result.pagination.offset
            } catch (e: Exception) {
                _errorMessage.value = "Error: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}

