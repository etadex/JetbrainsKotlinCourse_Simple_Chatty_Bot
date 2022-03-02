fun main() {
    val inputNumber: Int = readLine()!!.toInt()
    if (inputNumber % 2 == 0) {
        println("Divided by 2")
    }
    if (inputNumber % 3 == 0) {
        println("Divided by 3")
    }
    if (inputNumber % 5 == 0) {
        println("Divided by 5")
    }
    if (inputNumber % 6 == 0) {
        println("Divided by 6")
    }
}