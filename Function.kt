fun check(day: Int): String{
    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    return result
}
fun main(){
    println( check(4))
    println( check(7))

}