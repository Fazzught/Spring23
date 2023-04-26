fun main(){
    for (F in 0..20) {
        println("$F degrees Fahrenheit is equal to ${celsius(F.toDouble())} degrees Celsius.")
    }
}
fun celsius(F: Double): Double {
    return (5.0/9.0) * (F - 32.0)
}