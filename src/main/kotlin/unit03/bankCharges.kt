fun main(){
    print("Enter the number of checks you wrote this month: ")
    var check = readln().toInt()

    when {
        (check < 20) -> print("Your service fee for this month is: $" + (10.00 + check * .10))
        (check <= 39) -> print("Your service fee for this month is: $" + (10.00 + check * .08))
        (check <= 59) -> print("Your service fee for this month is: $" + (10.00 + check * .06))
        (check > 59) -> print("Your service fee for this month is: $" + (10.00 + check * .04))
    }
}