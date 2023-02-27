fun main() {
    print("Enter runner 1's name: ")
    var r1 = readLine()
    print("Enter runner 1's time in minutes: ")
    var t1 = readLine()!!.toInt()

    print("Enter runner 2's name: ")
    var r2 = readLine()
    print("Enter runner 2's time in minutes: ")
    var t2 = readLine()!!.toInt()

    print("Enter runner 3's name: ")
    var r3 = readLine()
    print("Enter runner 3's time in minutes: ")
    var t3 = readLine()!!.toInt()

    if (t1 > t2) {
        when{
            (t3 < t2) -> print("1st: $r3\n2nd: $r2\n3rd: $r1")
            (t3 > t2 && t3 < t1) -> print("1st: $r2\n2nd: $r1\n3rd: $r3")
            (t3 > t1) -> print("1st: $r2\n2nd: $r1\n3rd: $r3")
            (t2 == t3) -> print("$r2 and $r3 are tied for 1st\n$r1 is last")
            (t3 == t1) -> print("1st: $r2\n$r3 and $r1 are tied for last.")
        }
    }
    if (t2 > t1) {
        when{
            (t3 < t1) -> print("1st: $r3\n2nd: $r1\n3rd: $r2")
            (t3 > t1 && t3 < t2) -> print("1st: $r1\n2nd: $r3\n3rd: $r2")
            (t3 > t2) -> print("1st: $r1\n2nd: $r2\n3rd: $r3")
            (t1 == t3) -> print("$r1 and $r3 are tied for 1st\n$r2 is last")
            (t2 == t3) -> print("1st: $r1\n$r3 and $r2 are tied for last.")
        }
    }
    if (t2 == t1) {
        when{
            (t2 < t3) -> print("$r2 and $r1 are tied for 1st\n$r3 is last")
            (t3 < t2) -> print("1st: $r3\n$r1 and $r2 are tied for last.")
            (t2 == t3) -> print("$r1, $r2, and $r3 finished at the same time.")
        }
    }
}
