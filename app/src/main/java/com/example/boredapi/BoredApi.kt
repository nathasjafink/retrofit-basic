package com.example.boredapi

import retrofit2.http.GET

interface BoredApi {
    @GET("/fact")
    suspend fun getFact(
    ): Activity
}