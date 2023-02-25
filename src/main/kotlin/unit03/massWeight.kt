fun main() {
    print("Enter weight in pounds: ")
    var lbs = readLine()!!.toDouble()
    print("Enter your height in inches: ")
    var ht = readLine()!!.toDouble()
    var BMI = (lbs*703)/ Math.pow(ht.toDouble(), 2.toDouble())

    if (BMI > 25)
        println("This person is overweight")
    else if (BMI < 18.5)
        println("This person is underweight")
    else
        println("This person is the optimal weight")
}