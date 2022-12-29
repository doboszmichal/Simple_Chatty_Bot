fun main() {
    val firstInt = readln().toInt()
    val secondInt = readln().toInt()
    val thirdInt = readln().toInt()
    println((secondInt <= firstInt) && (firstInt <= thirdInt) || ((thirdInt <= firstInt) && (firstInt <= secondInt)))
}