import kotlin.math.abs

fun getLastDigit(p1: Int): Int = abs(p1 % 10)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}