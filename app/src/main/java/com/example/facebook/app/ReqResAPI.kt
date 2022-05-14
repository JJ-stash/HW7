package com.example.facebook.app

import com.example.facebook.app.dto.Post
import com.example.facebook.app.dto.ReqResData
import com.example.facebook.app.dto.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ReqResAPI {
    @GET("users")
    fun getUsers(@Query("page") page:Int):Call<ReqResData<List<User>>>
    @GET("users/{userId}")
    fun getUser(@Path("userId") userId: Long):Call<ReqResData<User>>

    @GET("posts")
    fun getPosts(@Query("page") page:Int):Call<ReqResData<List<Post>>>
    @GET("posts/{postId}")
    fun getPost(@Path("postId") postId: Long):Call<ReqResData<Post>>
}