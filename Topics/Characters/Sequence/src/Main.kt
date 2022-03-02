fun main() {
    var firstLetter: Char = readLine()!!.first()
    var secondLetter: Char = readLine()!!.first()
    val thirdLetter: Char = readLine()!!.first()
    val sequence: Boolean = ++firstLetter == secondLetter && ++secondLetter == thirdLetter
    println(sequence)
}