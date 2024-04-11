package com.example.boredapi

import com.google.gson.annotations.SerializedName

data class Activity(
    @SerializedName("fact")
    val fact: String,
    @SerializedName("length")
    val length: Int
)