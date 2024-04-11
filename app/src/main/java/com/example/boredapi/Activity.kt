package com.example.boredapi

import com.google.gson.annotations.SerializedName

data class Activity(
    @SerializedName("activity")
    val activity: String,
    @SerializedName("type")
    val type: String
)

data class Price (
    @SerializedName("activity")
    val activity: String,
    @SerializedName("price")
    val price: Int
)

data class Participants (
    @SerializedName("activity")
    val activity: String,
    @SerializedName("participants")
    val participants: Int
)

data class AllParameters (
    @SerializedName("activity")
    val activity: String,
    @SerializedName("accessibility")
    val accessibility: Double,
    @SerializedName("type")
    val type: String,
    @SerializedName("participants")
    val participants: Int,
    @SerializedName("price")
    val price: Int,
    @SerializedName("link")
    val link: String,
    @SerializedName("key")
    val key: String
)