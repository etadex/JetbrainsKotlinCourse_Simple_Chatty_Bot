fun main() {
    val numberA = readLine()!!.toInt()
    val numberB = readLine()!!.toInt()
    val numberC = readLine()!!.toInt()
    val sum = 20
    println(numberA + numberB == sum || numberA + numberC == sum || numberB + numberC == sum)
}