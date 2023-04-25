fun main (){
    var wholesale: Double? = null
    while (wholesale == null) {
        print("What is the item's wholesale cost? ")
        try {
            wholesale = readln().toDouble()
            if (wholesale != null && wholesale < 0) {
                println("Invalid input. The wholesale value can't be less than 0. Please enter a positive number.")
                wholesale = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a number.")
        }
    }
    var markup: Double? = null
    while (markup == null) {
        print("What is the item's markup as a percentage? ")
        try {
            markup = readln().toDouble()
            if (markup != null && markup < 0) {
                println("Invalid input. The markup percentage can't be less than 0. Please enter a positive number.")
                markup = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a number.")
        }
    }

    println("The item's wholesale cost is $" + "%.2f".format(wholesale) + " and markup is " + markup + "%. Therefore the retail price for this item is $" + "%.2f".format(calculateRetail(wholesale, markup)) + "." )

}
fun calculateRetail(wholesale: Double, markup: Double): Double {
    return wholesale + wholesale*(markup/100)
}