fun main() {
    val n: Int = readLine()!!.toInt()
    var numbersCount: Int = 0
    var risingNumber: Int = 0
    var timesPrinted: Int = 0
    while (numbersCount < n) {
        risingNumber++
        while (timesPrinted < risingNumber && numbersCount < n) {
            print("$risingNumber ")
            timesPrinted++
            numbersCount++
        }
        timesPrinted = 0
    }
}