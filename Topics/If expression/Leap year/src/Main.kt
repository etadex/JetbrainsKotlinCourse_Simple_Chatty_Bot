fun main() {
    val year: Int = readLine()!!.toInt()
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        print("Leap")
    } else {
        print("Regular")
    }
}