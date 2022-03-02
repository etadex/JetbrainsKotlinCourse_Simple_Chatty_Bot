fun isVowel(p1: Char): Boolean {
    return p1.uppercaseChar() == 'A' ||
        p1.uppercaseChar() == 'E' ||
        p1.uppercaseChar() == 'I' ||
        p1.uppercaseChar() == 'O' ||
        p1.uppercaseChar() == 'U'
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}