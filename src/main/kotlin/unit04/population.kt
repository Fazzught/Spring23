fun main() {
    var startPop: Int? = null
    while (startPop == null) {
        print("What is the starting size of the population? ")
        val inputPop = readLine()
        try {
            startPop = inputPop?.toInt()
            if (startPop != null && startPop < 2) {
                println("Invalid input. Starting population size cannot be less than 2.")
                startPop = null
            }
        } catch (e: Exception) {
            println("Invalid input. Starting population must be a positive integer greater than 2.")
        }
    }
    var avgIncrease: Int? = null
    while (avgIncrease == null) {
        print("What is the average daily population increase(as a percentage)? ")
        val inputAvg = readLine()
        try {
            avgIncrease = inputAvg?.toInt()
            if (avgIncrease != null && avgIncrease < 0) {
                println("Invalid input. Average daily population increase must not be a negative number.")
                avgIncrease = null
            }
        } catch (e: Exception) {
            println("Invalid input. Average daily population increase must be a non-negative integer.")
        }
    }
    var days: Int? = null
    while (days == null) {
        print("How many days will this population multiply? ")
        val dayInput = readLine()
        try {
            days = dayInput?.toInt()
            if (days != null && days < 1) {
                println("Invalid input. The number of days must be greater than 0.")
                days = null
            }
        } catch (e: Exception) {
            println("Invalid input. The number of days must be a positive integer greater than 0.")
        }
    }
    var avg = (avgIncrease.toDouble()/ 100)
    var pop = startPop.toDouble()
    println("On day 1, there are $startPop organisms.")

    for (day in 2..days) {
        pop += pop * avg
        println("On day $day there are "+ pop.toInt() + " organisms.")
        }
}