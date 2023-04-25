fun isNumberDivisible (number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}
fun isPrime(number: Int): Boolean {
    if (number <=1) {
        return false
    }
    for (i in 2 until number){
        if (isNumberDivisible(number, i)){
            return false
        }
    }
    return true
}

fun main(){
    println("6 is a prime number: " + isPrime(6))
    println("13 is a prime number: " + isPrime(13))
    println("8893 is a prime number: " + isPrime(8893))
}