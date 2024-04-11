package com.example.boredapi

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstance()
        val activity = instance.apiService.getActivity()
        println(activity)
        val price = instance.apiService.getPrices()
        println(price)
        val participants = instance.apiService.getParticipants()
        println(participants)
    }
}