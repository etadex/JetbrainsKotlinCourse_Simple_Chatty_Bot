fun main() {
    val rangeStart: Int = readLine()!!.toInt()
    val rangeEnd: Int = readLine()!!.toInt()
    var product: Long = 1
    for (i in rangeStart until rangeEnd) {
        product *= i
    }
    print(product)
}