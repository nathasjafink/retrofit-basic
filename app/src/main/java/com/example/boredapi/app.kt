package com.example.boredapi

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstance()
        val activity = instance.apiService.getActivity()
        println(activity)
        val price = instance.apiService.getPrices()
        println(price)

        /*
        Exercise B
Without using the android framework (empty project - as seen in the reference project)

Expand the project with another API call with parameters

The program takes a number of participants as parameter and returns a random activity with a given numbner of participants

The user inputs the parameters by standard input: readLine()
         */
        print("Enter the number of participants: ")
        val participantsInput = readlnOrNull()

        val participantsToInt = participantsInput?.toIntOrNull()

        if (participantsInput != null) {
            val participants = participantsToInt?.let { instance.apiService.getParticipants(it) }
            println(participants)
        } else {
            println("Invalid input. Please enter a valid number of participants.")
        }

    }
}