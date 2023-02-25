fun main() {
    print("Enter a name: ")
    var n1 = readLine()!!
    print("Enter a second name: ")
    var n2 = readLine()!!
    print("Enter a third name: ")
    var n3 = readLine()!!

    var list = mutableListOf(n1, n2, n3)
    list.sort()

    println(list)
}