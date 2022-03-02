fun main() {
    val inputString: String = readLine()!!.toString()
    val symbolNumber: Int = readLine()!!.toInt()
    var symbolNumberNatural = symbolNumber - 1
    if (symbolNumberNatural < 0) {
        symbolNumberNatural = 0
    }
    val symbolChar: Char = inputString[symbolNumberNatural]
    print("Symbol # $symbolNumber of the string \"$inputString\" is \'$symbolChar\'")
}