package com.example.boredapi

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstance()
        val activity = instance.apiService.getActivity()
        println(activity)
        //val price = instance.apiService.getPrices()
        //println(price)

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

        /*
        Exercise C
Without using the android framework (empty project - as seen in the reference project)

Expand the project with another API call with parameters

The program takes a specified accessibility in an inclusively constrained range of price (min / max price)

The user inputs the parameters by standard input: readLine()

Implement with a call instead of returning the Activity object

If the response is successful print the activity

If the response if not successful print "failure"
         */
        println("Enter a number for accessibility: ")
        val accessibilityInput = readlnOrNull()
        val accessibilityToInt = accessibilityInput?.toDoubleOrNull()

        println("Enter a min price: ")
        val minPriceInput = readLine()
        val minPriceToDouble = minPriceInput?.toDoubleOrNull()

        println("Enter a max price: ")
        val maxPriceInput = readLine()
        val maxPriceToDouble = maxPriceInput?.toDoubleOrNull()

        if (minPriceToDouble != null && maxPriceToDouble != null && accessibilityToInt != null) {
            // Make your API call here
            val price = instance.apiService.getTheInputtedMinMaxPrice(accessibilityToInt, minPriceToDouble, maxPriceToDouble)
            println("API response: $price")
        } else {
            println("Invalid input. Please enter valid numbers for min price, max price, and accessibility.")
        }
    }
}