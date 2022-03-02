fun main() {
    val sequenceLength: Int = readLine()!!.toInt()
    var maximumDivisibleByFour: Int = 0
    repeat(sequenceLength) {
        val next: Int = readLine()!!.toInt()
        if (next % 4 == 0 && next > maximumDivisibleByFour) maximumDivisibleByFour = next
    }
    println(maximumDivisibleByFour)
}