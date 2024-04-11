package com.example.boredapi

import retrofit2.http.GET

interface BoredApi {
    @GET("activity")
    suspend fun getActivity(
    ): Activity

    @GET("activity?price=0.0")
    suspend fun getPrices(
    ): Price

    @GET("activity?participants=1")
    suspend fun getParticipants(
    ): Participants
}