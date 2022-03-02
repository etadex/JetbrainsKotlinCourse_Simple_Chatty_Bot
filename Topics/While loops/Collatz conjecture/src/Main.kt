fun main() {
    var inputNumber: Int = readLine()!!.toInt()
    print("$inputNumber ")
    while (inputNumber != 1) {
        if (inputNumber % 2 == 0) {
            inputNumber /= 2
        } else {
            inputNumber = inputNumber * 3 + 1
        }
        print("$inputNumber ")
    }
}