package com.example.belajarretrofit

import okhttp3.Call

interface Api {
    @GET("posts")
    fun getPosts(): Call<ArrayList<PostResponse>>
}

annotation class GET(val value: String)
