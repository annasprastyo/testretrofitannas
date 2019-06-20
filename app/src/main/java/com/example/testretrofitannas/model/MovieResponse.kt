package com.example.testretrofitannas.model


object MovieResponse {
    data class MovieResponse(var page : Int,
                             val results : ArrayList<Movie.Movie>,
                             val totalResult : Int,
                             val totalPage : Int)
}