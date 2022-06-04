package oop
class Student(var name: String ,var age:Int){

}
//2nd way
class Student2(){
    constructor(n: String,a: Int) : this() {
        println("Name = ${n}")
        println("Id = ${a}")
    }

}
fun main(){
    var myClass = Student("saikat", 24)
    println("Name = ${ myClass.name}")
    println("Age = ${ myClass.age}")
    println("---------------------")
    val Student2 = Student2 ("Ashu", 101)
}
