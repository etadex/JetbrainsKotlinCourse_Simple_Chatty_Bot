import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var prevNum: Int = scanner.nextInt()
    var position: Int = 1
    var largest: Int = prevNum
    var largestPos: Int = 1
    do {
        position++
        val nextNumber: Int = scanner.nextInt()
        if (nextNumber > prevNum) {
            prevNum = nextNumber
            largest = nextNumber
            largestPos = position
        }
    } while (scanner.hasNext())
    print("$largest $largestPos")
}