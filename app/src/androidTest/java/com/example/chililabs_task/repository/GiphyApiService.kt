package com.example.chililabs_task.repository
import network.GiphyResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyApiService {
    @GET("gifs/search")
    suspend fun searchGifs(
        @Query("https://developers.giphy.com/docs/api/endpoint#search") apiKey: String,
        @Query("q") query: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): GiphyResponse
}