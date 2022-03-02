fun main() {    
    val hoursEnough = readLine()!!.toInt()
    val hoursMax = readLine()!!.toInt()
    val hoursActual = readLine()!!.toInt()
    if (hoursActual in hoursEnough..hoursMax) {
        print("Normal")
    } else if (hoursActual < hoursEnough) {
        print("Deficiency")
    } else {
        print("Excess")
    }
}