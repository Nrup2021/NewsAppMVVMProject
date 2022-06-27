package com.example.newsappmvvmproject.ui.api

import com.example.newsappmvvmproject.ui.models.NewsResponse
import com.example.newsappmvvmproject.ui.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    //https://newsapi.org/v2/top-headlines?country=us&page=1&apikey=cb74cdb845fe4bd081e3488ab6579ff2
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "us",
        @Query("page") pageNumber: Int = 1,
        @Query("apikey") apiKey: String = API_KEY
    ): Response<NewsResponse>

    // https://newsapi.org/v2/everything?q=developer&page=1&apikey=cb74cdb845fe4bd081e3488ab6579ff2

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("page") pageNumber: Int = 1,
        @Query("apikey") apiKey: String = API_KEY
    ): Response<NewsResponse>
}