fun main() {
    print("Enter a name: ")
    var n1 = readLine()!!
    print("Enter their time in minutes: ")
    var t1 = readLine()!!.toInt()
    print("Enter a second name: ")
    var n2 = readLine()!!
    print("Enter their time in minutes: ")
    var t2 = readLine()!!.toInt()
    print("Enter a third name: ")
    var n3 = readLine()!!
    print("Enter their time in minutes: ")
    var t3 = readLine()!!.toInt()

    var list = mutableListOf(t1, t2, t3)
    list.sort()

    print(list)
}
