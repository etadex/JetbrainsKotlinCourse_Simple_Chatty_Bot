fun main() {
    val seqLen: Int = readLine()!!.toInt()
    var sum: Int = 0
    repeat(seqLen) {
        if (readLine()!!.toInt() > 0) sum += 1
    }
    print(sum)
}