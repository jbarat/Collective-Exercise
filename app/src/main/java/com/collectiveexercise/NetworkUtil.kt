package com.collectiveexercise

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

private val retrofit = Retrofit.Builder().baseUrl("http://jsonplaceholder.typicode.com")
    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

val networkService = retrofit.create(Service::class.java)