import java.util.*

fun main () {
    val rando = Random()
    val randoNum = rando.nextInt(51)
    var userGuess: Int? = null
    var counter = 0

    while (userGuess == null) {
        print("Enter a number between 0 and 50. If you have the right number I'll tell you, otherwise I'll tell if you're too high or too low: ")
        val input = readLine()
        try {
            userGuess = input?.toInt()
            counter += 1
            if (userGuess != null && userGuess > randoNum) {
                println("Too high, try again.")
                userGuess = null
            } else if (userGuess != null && userGuess < randoNum) {
                println("Too low, try agan.")
                userGuess = null
            } else {
                println("Congratulations! You got it the number was $randoNum and you got it in $counter tries.")
            }
        } catch (e: Exception){
            println("Invalid input. Please enter a number between 1 and 50.")

        }    }
}