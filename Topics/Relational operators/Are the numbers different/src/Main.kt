fun main() {
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()
    val thirdNumber = readLine()!!.toInt()
    println(firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber)
}