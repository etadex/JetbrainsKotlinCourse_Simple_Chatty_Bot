fun main() {
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    val c: Int = readLine()!!.toInt()
    val d: Int = readLine()!!.toInt()
    val upperLimit: Int = 1000
    val lowerLimit: Int = 0
    for (i in lowerLimit..upperLimit) {
        if (a * i * i * i + b * i * i + c * i + d == 0) println(i)
    }
}