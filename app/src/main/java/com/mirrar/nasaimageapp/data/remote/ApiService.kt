package com.mirrar.nasaimageapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("planetary/apod")
    suspend fun fetchImageOfTheDay(
        @Query("date") date: String? = null,
    ): NasaImageDto
}