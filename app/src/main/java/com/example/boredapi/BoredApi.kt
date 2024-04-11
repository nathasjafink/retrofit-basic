package com.example.boredapi

import retrofit2.http.GET
import retrofit2.http.Query

interface BoredApi {
    @GET("activity")
    suspend fun getActivity(
    ): Activity

    @GET("activity?price=0.0")
    suspend fun getPrices(
    ): Price

    @GET("activity")
    suspend fun getParticipants(
        @Query("participants") participants: Int
    ): Participants

    @GET("activity?")
    suspend fun getTheInputtedMinMaxPrice(
        @Query("accessibility") accessibility: Int,
        @Query("minprice") minPrice: Int,
        @Query("maxprice") maxPrice: Int
    ) : AllParameters
}