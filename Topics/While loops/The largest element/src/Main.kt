fun main() {
    var maxNum: Int = Int.MIN_VALUE
    do {
        val nextNum: Int = readLine()!!.toInt()
        if (nextNum > maxNum) maxNum = nextNum
    } while (nextNum > 0)
    print(maxNum)
}