fun main() {
    print("Enter mass of object in kilograms: ")
    var mass = readLine()!!.toDouble()

    var weight = mass * 9.8

    if (weight > 1000)
        println("This object is too heavy")
    else if (weight < 10)
        println("This object is too light")
    else
        println("This object weighs " + weight + " newtons.")
}