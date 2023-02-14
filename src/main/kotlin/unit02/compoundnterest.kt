import kotlin.math.*

fun main() {
    print("Enter the principal amount of money deposited: ")
    var principal = readLine()!!
    print("Enter the annual interest rate as a percent value: ")
    var interest = readLine()!!
    print("Enter the number of times per year interest is compounded: ")
    var compounded = readLine()!!
    print("Enter the number of years interest is collected: ")
    var years = readLine()!!

    var p = principal.toDouble()
    var i = (interest.toDouble() / 100)
    var c = compounded.toDouble()
    var y = years.toDouble()
    var compPerYear = c * y
    var x = (1 + (i / c))
    var amount = p * Math.pow(x.toDouble(), compPerYear.toDouble())
    var amountRounded = String.format("%.2f", amount)

    println("The amount is equal to $$amountRounded.")

}