fun main() {
    var firstLetter = readLine()!!.first()
    var secondLetter = readLine()!!.first()
    var thirdLetter = readLine()!!.first()
    var fourthLetter = readLine()!!.first()
    firstLetter -= 1
    secondLetter -= 1
    thirdLetter -= 1
    fourthLetter -= 1
    print("$firstLetter\n$secondLetter\n$thirdLetter\n$fourthLetter")
}