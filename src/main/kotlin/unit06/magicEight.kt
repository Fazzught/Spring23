fun main() {
    val responses = arrayOf(
        "Yes, absolutely!",
        "For sure!",
        "Believe it!",
        "Without a doubt, yes.",
        "Signs point to yes.",
        "I don't know.",
        "Ask me later.",
        "Not now. Try again later.",
        "Nope.",
        "I don't think so.",
        "No...just no."
    )
    var letsPlay = true

    while (letsPlay) {
        println("Ask a yes or no question that ends with a question mark or type 'quit' to exit: ")
        val input = readLine()?.toLowerCase()
        if (input == "quit") {
            letsPlay = false
        } else if (input?.endsWith("?") == true) {
            val responseIndex = (0 until responses.size).random()
            println(responses[responseIndex])
        } else {
            println("I can only answer yes or no questions that end in a question mark.")
        }
    }
}