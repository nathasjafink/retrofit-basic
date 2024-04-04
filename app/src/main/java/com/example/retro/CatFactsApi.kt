package com.example.retro

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CatFactsApi {
    @GET("/fact")
    suspend fun getFact(
    ): CatFact
}