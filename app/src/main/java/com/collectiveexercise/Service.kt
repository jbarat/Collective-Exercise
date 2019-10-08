package com.collectiveexercise

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface Service {

    @GET("/users/1")
    fun getUser(): Response<UserModel>

    @GET("/users/1")
    fun getReactiveUser(): Single<Response<UserModel>>

    @GET("/users/1")
    suspend fun getCoroutineUser(): UserModel
}