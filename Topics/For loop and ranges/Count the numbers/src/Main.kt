fun main() {
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    val n: Int = readLine()!!.toInt()
    var c: Int = 0
    for (i in a..b) {
        if (i % n == 0) {
            c += 1
        }
    }
    print(c)
}