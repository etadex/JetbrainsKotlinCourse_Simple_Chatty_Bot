fun main() {
    val numbersCount: Int = readLine()!!.toInt()
    var sum: Int = 0
    for (i in 1..numbersCount) {
        sum += readLine()!!.toInt()
    }
    print(sum)
}