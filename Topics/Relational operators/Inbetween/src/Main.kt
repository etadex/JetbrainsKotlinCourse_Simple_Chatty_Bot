fun main() {
    val numberA: Int = readLine()!!.toInt()
    val numberB: Int = readLine()!!.toInt()
    val numberC: Int = readLine()!!.toInt()
    print(numberA in numberB..numberC || numberA in numberC..numberB)
}