package com.dicoding.asclepius.data.api

import com.dicoding.asclepius.data.response.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    fun getCancerNews(
        @Query("language") language: String = "en",
        @Query("category") category: String = "health",
    ): Call<Response>
}