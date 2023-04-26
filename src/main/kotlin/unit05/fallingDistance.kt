import kotlin.math.pow
fun main(){
    for (time in 1..10) {
        var distance = fallingDistance(time.toDouble())
        println("When $time second(s) has passed, the object has fallen a distance of $distance meters.")
    }
}
fun fallingDistance(time: Double): Double {
    return (0.5)* (9.8) * (time.pow(2))
}

