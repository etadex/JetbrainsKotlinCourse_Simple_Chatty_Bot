fun main() {
    val firstLetter = readLine()!!.first()
    val secondLetter = readLine()!!.first()
    println(firstLetter.equals(secondLetter, ignoreCase = true))
}