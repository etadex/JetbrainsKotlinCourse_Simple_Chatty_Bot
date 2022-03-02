fun main() {
    val rangeStart: Int = readLine()!!.toInt()
    val rangeEnd: Int = readLine()!!.toInt()
    var sum: Int = 0
    for (i in rangeStart..rangeEnd) {
        sum += i
    }
    print(sum)
}