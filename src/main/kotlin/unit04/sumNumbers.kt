fun main() {
    var num: Int? = null
    while (num == null) {
        print("Enter a positive nonzero integer: ")
        val input = readLine()
        try {
            num = input?.toInt()
            if (num != null && num < 1) {
                println("Invalid input. Please enter a positive nonzero integer.")
                num = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive nonzero integer.")
        }
    }
    var sum = 0
    for  (num in 1..num) {
         sum += num
    }
    println ("The sum of the numbers up to $num is equal to $sum.")
}