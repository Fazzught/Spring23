fun main() {
    print("Enter a number between 1 through 10: ")
    var number = readLine()!!
    var num = number.toInt()

    when (num) {
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("VII")
        8 -> println("VIII")
        9 -> println("IX")
        10 -> println("X")
        else -> println("The number entered was not between 1 through 10")
    }
}