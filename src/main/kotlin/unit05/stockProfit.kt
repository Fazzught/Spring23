fun main(){
    var NS: Double? = null
    while (NS == null) {
        print("Enter the number of shares: ")
        try {
            NS = readln().toDouble()
            if (NS != null && NS < 0) {
                println("Invalid input. The number of shares can't be less than 0. Please enter 0 or a positive number.")
                NS = null
            }
        } catch (e: Exception) {
            println("Invalid input. Number of shares must be a number.")
        }
    }
    var PP: Double? = null
    while (PP == null) {
        print("Enter the purchase price per share: ")
        try {
            PP = readln().toDouble()
            if (PP != null && PP < 0) {
                println("Invalid input. The purchase price should not be less than 0. Please enter 0 or a positive number.")
                PP = null
            }
        } catch (e: Exception) {
            println("Invalid input. The purchase price must be a number.")
        }
    }
    var PC: Double? = null
    while (PC == null) {
        print("Enter the purchase commission paid: ")
        try {
            PC = readln().toDouble()
            if (PC != null && PC < 0) {
                println("Invalid input. The purchase commission paid should not be less than 0. Please enter 0 or a positive number.")
                PC = null
            }
        } catch (e: Exception) {
            println("Invalid input. The purchase commission paid must be a number.")
        }
    }
    var SP: Double? = null
    while (SP == null) {
        print("Enter the sales price per share: ")
        try {
            SP = readln().toDouble()
            if (SP != null && SP < 0) {
                println("Invalid input. The sales price should not be less than 0. Please enter 0 or a positive number.")
                SP = null
            }
        } catch (e: Exception) {
            println("Invalid input. The sales price must be a number.")
        }
    }
    var SC: Double? = null
    while (SC == null) {
        print("Enter the sales commission paid: ")
        try {
            SC = readln().toDouble()
            if (SC != null && SC < 0) {
                println("Invalid input. The sales commission paid should not be less than 0. Please enter 0 or a positive number.")
                SC = null
            }
        } catch (e: Exception) {
            println("Invalid input. The sales commission paid must be a number.")
        }
    }
    var profit = stockProfit(NS, PP, PC, SP, SC)
    if (profit > 0) {
        print("Good job! You earned a profit of $" + "%.2f".format(profit) + "!")
    } else if (profit < 0) {
        print("Oh no...you suffered a loss of $" + "%.2f".format(profit) + ".")
    } else {
        print("No loss or gain was made.")
    }

}
fun stockProfit(NS:Double, PP:Double, PC:Double, SP:Double, SC:Double): Double{
    return ((NS*SP)-SC)-((NS*PP)+PC)
}