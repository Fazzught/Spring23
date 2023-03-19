fun main () {
    println("Enter a string: ")
    val input = readln()

    println("Enter a character: ")
    val char = readln()[0]

    var sum = 0
    for (character in input) {
        if (character == char) {
            sum += 1
        }
    }
    if (sum < 1) {
        println("This character is not in the string.")
    } else
        println("This character is in the string $sum times")
}