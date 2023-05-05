fun main(){
    val room_list = arrayOf(
        arrayOf("You are in a dusty and quiet bedroom. \nThere are passages leading to the north and south.",3,1,-1,-1),
        arrayOf("You find yourself in a dank, dark hallway. \nThere is a passage to the west, a partially blocked entry to the north, and a door to the east.",4,2,-1,0),
        arrayOf("You step into an abandoned dining room, table set with dishes and silverware long unused. \nThere is a set of double doors to the north and a door to the west.",5,-1,-1,1),
        arrayOf("You find yourself in a small and meager bedroom in what appears to be the tallest spire in this castle. \nThere is a stairway to the east and a passage to the south.",-1,4,0,-1),
        arrayOf("You enter a grand hallway now fallen into ruin. \nThere is a stairway to the west, a set of double doors to the east, a partially blocked passage way to the south, and passage to the north.",6,5,1,3),
        arrayOf("You step into an old kitchen. The stove looks as though it has not been lit in years and a layer of grime and a pungent smell of decay permeates the room. \n There are sets of double doors which lead to the west and south",-1,-1,2,4),
        arrayOf("You step out onto a stone balcony. In the distance you can see a lake and a forest and the ground which is around 50 feet below you. \nThere is a passage way which leads back into the castle to the south of you.",-1,-1,4,-1))

    println("Welcome to the Abandoned Castle text adventure!")
    println("Enter 'n' to move north, 'e' to move east, 's' to move south, or 'w' to move west")
    println("When you're done playing, type 'y' when asked if you want to stop otherwise hit any other key to continue.")
    var current_room_index = 0
    println(room_list[0][0])
    var done = false

    while (!done) {
        val copy_current_room_index = current_room_index
        var valid_response = false
        while (!valid_response){
            print("Which way should I move?: ")
            val direction = readln().toLowerCase()

            when (direction) {
                "n" -> current_room_index = room_list[current_room_index][1] as Int
                "e" -> current_room_index = room_list[current_room_index][2] as Int
                "s" -> current_room_index = room_list[current_room_index][3] as Int
                "w" -> current_room_index = room_list[current_room_index][4] as Int
            }
            if (current_room_index == -1) {
                println("Can't go that way.")
                current_room_index = copy_current_room_index
            } else {
                valid_response = true
            }
        }
        println(room_list[current_room_index][0])
        print("Are you done playing?: ")
        if (readln().toLowerCase() == "y") {
            done = true
            print("Thanks for playing.")
        }
    }
}