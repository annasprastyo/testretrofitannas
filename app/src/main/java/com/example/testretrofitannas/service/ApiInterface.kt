package com.example.testretrofitannas.service

import com.example.testretrofitannas.model.Movie.Movie
import com.example.testretrofitannas.model.MovieResponse.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("movie/latest")
    fun getMovieLatest(@Query("api_key") apiKey : String) : Call<Movie>
    @GET("movie/popular")
    fun getPopularMovie(@Query("api_key") apiKey: String) : Call<MovieResponse>
}