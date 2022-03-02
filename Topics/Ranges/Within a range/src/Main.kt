fun main() {
    val firstRangeStart: Int = readLine()!!.toInt()
    val firstRangeEnd: Int = readLine()!!.toInt()
    val secondRangeStart: Int = readLine()!!.toInt()
    val secondRangeEnd: Int = readLine()!!.toInt()
    val sampleNumber: Int = readLine()!!.toInt()
    println(sampleNumber in firstRangeStart..firstRangeEnd || sampleNumber in secondRangeStart..secondRangeEnd)
}
