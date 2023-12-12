package repository

import com.example.chililabs_task.repository.GiphyApiService
import network.GiphyResponse

import javax.inject.Inject

class GifRepository @Inject constructor(private val apiService: GiphyApiService) {

    private val giphyApiKey = "https://developers.giphy.com/docs/api/endpoint#search"

    suspend fun searchGifs(query: String, offset: Int): GiphyResponse {
        return apiService.searchGifs(giphyApiKey, query, 25, offset)
    }
}

