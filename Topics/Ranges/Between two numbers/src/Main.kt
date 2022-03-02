fun main() {
    val sampleNumber: Int = readLine()!!.toInt()
    val rangeStart: Int = readLine()!!.toInt()
    val rangeEnd: Int = readLine()!!.toInt()
    println(sampleNumber in rangeStart..rangeEnd)
}
