fun main() {
    val cups = readln().toInt()
    val isWeekend = readln().toBoolean()
    println(((cups in 10..20) && !isWeekend) || (cups in 15..25) && isWeekend)
}