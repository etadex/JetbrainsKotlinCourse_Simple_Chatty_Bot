fun main() {
    val digit: Int = readLine()!!.toInt()
    val character: Char = readLine()!!.first()
    println(digit == character.code)
}