import java.util.*

fun main () {
    val rando = Random()
    val randoNum = rando.nextInt(51)
    var userGuess: Int? = null

    while (userGuess == null) {
        print("Enter a number between 0 and 50. If you have the right number I'll tell you, otherwise I'll tell if you're too high or too low: ")
        val input = readLine()
        try {
        userGuess = input?.toInt()
        if (userGuess != null && userGuess > randoNum) {
            println("Too high, try again.")
            userGuess = null
        } else if (userGuess != null && userGuess < randoNum) {
            println("Too low, try agan.")
            userGuess = null
        } else {
            println("Congratulations! You got it the number was $randoNum.")
        }
    } catch (e: Exception){
        println("Invalid input. Please enter a number between 1 and 50.")

        }    }
}