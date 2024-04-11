package com.example.boredapi

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstance()
        val fact = instance.apiService.getFact()
        println(fact)
    }
}