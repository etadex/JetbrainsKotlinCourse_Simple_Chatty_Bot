fun main() {
    val inputLetter: Char = readLine()!!.first()
    println(inputLetter.isUpperCase() || inputLetter.isDigit() && inputLetter !== '0')
}