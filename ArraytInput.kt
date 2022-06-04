fun main() {
    print("Enter Array size: ")
    val arraySize = readLine()!!.toInt()
    println("Enter Array Elements")
    val arr = Array<Int>(arraySize) {
        readLine()!!.toInt()
    }

    for (x in arr)
        println(x)
}