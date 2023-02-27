fun main() {
    print("Is anybody in your group vegetarian, please enter Y for yes or N for no? ")
    var veg = readLine()

    print("Is anybody in your group vegan, please enter Y for yes or N for no? ")
    var plant = readLine()

    print("Is anybody in your group gluten-free, please enter Y for yes or N for no? ")
    var glute = readLine()

    println("Your restaurant options are:")
    when {
        (veg == "Y" && plant == "Y" && glute == "Y") -> print ("Corner Cafe\nThe Chef's Kitchen")
        (veg == "Y" && plant == "Y" && glute == "N") -> print ("Corner Cafe\nThe Chef's Kitchen")
        (veg == "Y" && plant == "N" && glute == "Y") -> print ("Main Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")
        (veg == "Y" && plant == "N" && glute == "N") -> print ("Mama's Fine Italian\nMain Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")
        (veg == "N" && plant == "N" && glute == "Y") -> print ("Main Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")
        (veg == "N" && plant == "Y" && glute == "Y") -> print ("Corner Cafe\nThe Chef's Kitchen")
        (veg == "N" && plant == "Y" && glute == "N") -> print ("Corner Cafe\nThe Chef's Kitchen")
        (veg == "N" && plant == "N" && glute == "N") -> print ("Joe's Gourmet Burgers\nMama's Fine Italian\nMain Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")

    }
}


