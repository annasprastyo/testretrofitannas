package com.example.testretrofitannas.model

import com.google.gson.annotations.SerializedName

object Movie {
    data class Movie(@SerializedName("original_title") val originalTitle : String?,
                     @SerializedName("overview") val overview : String?,
                     @SerializedName("poster_path") val posterPath : String?)
}