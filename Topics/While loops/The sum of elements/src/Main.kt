import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var sum: Int = 0
    do {
        val nextNum: Int = scanner.nextInt()
        sum += nextNum
    } while (scanner.hasNext() && nextNum != 0)
    println(sum)
}