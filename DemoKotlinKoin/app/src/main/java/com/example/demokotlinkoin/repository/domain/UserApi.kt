package com.example.demokotlinkoin.repository.domain

import com.example.demokotlinkoin.repository.entity.ToDo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {
    @GET("/todos/{id}")
    suspend fun getToDo(@Path( value = "id")todoId: Int): ToDo
}