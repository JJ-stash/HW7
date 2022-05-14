package com.example.facebook.app

import com.example.facebook.app.dto.Post
import com.example.facebook.app.dto.ReqResData
import com.example.facebook.app.dto.User
import retrofit2.Call
import retrofit2.http.*

interface ReqResAPI {
    @GET("users")
    fun getUsers(@Query("page") page:Int):Call<ReqResData<List<User>>>
    @GET("users/{userId}")
    fun getUser(@Path("userId") userId: Long):Call<ReqResData<User>>

    @DELETE("users")
    fun deleteUser(@Path("userId") userId: Long)

    @GET("posts")
    fun getPosts(@Query("page") page:Int):Call<ReqResData<List<Post>>>
    @GET("posts/{postId}")
    fun getPost(@Path("postId") postId: Long):Call<ReqResData<Post>>

    @DELETE("posts")
    fun deletePost(@Path("postId") postId: Long)
}