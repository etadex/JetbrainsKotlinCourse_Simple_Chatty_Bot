fun main() {
    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val numberThree = readLine()!!.toInt()
    var positiveNumbersEntered = 0
    val numberOneIsPositive = numberOne > 0
    val numberTwoIsPositive = numberTwo > 0
    val numberThreeIsPositive = numberThree > 0
    if (numberOneIsPositive) {
        positiveNumbersEntered += 1
    }
    if (numberTwoIsPositive) {
        positiveNumbersEntered += 1
    }
    if (numberThreeIsPositive) {
        positiveNumbersEntered += 1
    }
    val outputValue = positiveNumbersEntered == 1
    println(outputValue)
}