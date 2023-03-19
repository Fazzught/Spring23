fun main () {
    println("Enter today's sales for store 1: ")
    val s1 = readln().toInt()/100

    println("Enter today's sales for store 2: ")
    val s2 = readln().toInt()/100

    println("Enter today's sales for store 3: ")
    val s3 = readln().toInt()/100

    println("Enter today's sales for store 4: ")
    val s4 = readln().toInt()/100

    println("Enter today's sales for store 5: ")
    val s5 = readln().toInt()/100

    var sum1 = ""
    var sum2 = ""
    var sum3 = ""
    var sum4 = ""
    var sum5 = ""
    for  (num in 1..s1) {
        sum1 += "*"
    }
    for (num in 1..s2){
            sum2 +="*"
    }
    for (num in 1..s3){
            sum3 +="*"
        }
    for (num in 1..s4){
            sum4 +="*"
        }
    for (num in 1..s5){
            sum5 +="*"
        }
    println ("Store 1: $sum1")
    println ("Store 2: $sum2")
    println ("Store 3: $sum3")
    println ("Store 4: $sum4")
    println ("Store 5: $sum5")
}
