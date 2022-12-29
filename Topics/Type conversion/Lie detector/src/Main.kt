import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val takenInput = scanner.next()
    val trueOrFalse = takenInput.toBoolean()
    print(trueOrFalse)
}