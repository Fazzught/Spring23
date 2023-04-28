fun main() {
    var letsPlay = true

    while (letsPlay) {
        println("Do you want to play Rock-Paper-Scissors? Enter 'y' for yes or 'n' for no: ")
        val wantsToPlay = wantsToPlay()
        println("Do you want to play again? (y/n)")
        letsPlay = readLine()?.toLowerCase() == "y"
    }
}

fun wantsToPlay() {
    val wantsToPlay = readLine()?.toLowerCase() == "y"
    if (wantsToPlay) {
        daRules()
        val cpuAnswer = cpuAnswer()
        val playerAnswer = playerAnswer()
        println("Computer answer: $cpuAnswer")

        var winner = determineWinner(playerAnswer, cpuAnswer)
        println (winner)
    }
}

fun daRules(): Unit {
    println("These are the rules of the game:")
    println("Rock is 1")
    println("Paper is 2")
    println("Scissors is 3")
}

fun playerAnswer(): Int {
    var playerAnswer: Int? = null
    while (playerAnswer == null) {
        print("What's your answer? ")
        try {
            playerAnswer = readln().toInt()
            if (playerAnswer != null && playerAnswer < 1 || playerAnswer > 3) {
                println("Invalid input. You have to enter 1 for Rock, 2 for Paper, or 3 for Scissors.")
                playerAnswer = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a number.")
        }
    }
    return playerAnswer
}

fun cpuAnswer(): Int {
        return (1..3).random()
}

fun determineWinner(playerAnswer: Int, cpuAnswer: Int): String {
    if (playerAnswer == 1 && cpuAnswer == 3)
        return "Rock smashes scissors! You win!"
    else if (playerAnswer == 2 && cpuAnswer == 1)
        return "Paper covers rock! You win!"
    else if (playerAnswer == 3 && cpuAnswer == 2)
        return "Scissors cut paper! You win!"
    else if (playerAnswer == 1 && cpuAnswer == 2)
        return "Paper covers rock! You lose!"
    else if (playerAnswer == 2 && cpuAnswer == 3)
        return "Scissors cut paper! You lose!"
    else if (playerAnswer == 3 && cpuAnswer == 1)
        return "Rock smashes scissors! You lose!"
    else
        return "It's a tie! Try again."
}

