fun main() {
    print("Enter a month as a number: ")
    var month = readLine()!!.toInt()
    print("Enter the day of the month: ")
    var day = readLine()!!.toInt()
    print("Enter the last two numbers of the year: ")
    var year = readLine()!!.toInt()

    if (month * day == year)
        println ("This date is magic.")
    else
        println("This date isn't magic.")
}