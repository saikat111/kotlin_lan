package oop

class Car1(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }
}

fun main() {
    val c1 = Car1("Ford", "Mustang", 1969)

    // Call the function
    c1.drive()
}