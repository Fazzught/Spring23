fun main(args: Array<String>) {
    print("Enter the name of your favorite city: ")
    var cityName = readLine()!!
    println(cityName.length)
    println(cityName.toUpperCase())
    println(cityName.toLowerCase())
    println(cityName[0])
}