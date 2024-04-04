package com.example.retro

suspend fun main() {
    val instance = RetrofitInstance()
    val fact = instance.apiService.getFact()
    println(fact)
}