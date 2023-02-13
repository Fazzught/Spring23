fun main(args: Array<String>) {
    print("Enter number of cookies eaten: ")
    var cookies = readLine()!!
    var intake = cookies.toInt() * 75
    println("Your calorie intake was: $intake calories")
}