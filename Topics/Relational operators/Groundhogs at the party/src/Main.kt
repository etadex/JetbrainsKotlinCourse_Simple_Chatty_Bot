fun main() {
    val butterCups: Int = readLine()!!.toInt()
    val weekend: Boolean = readLine()!!.toBoolean()
    val isSuccessful: Boolean = (butterCups in 10..20 && !weekend) ||
            (butterCups in 15..25 && weekend)
    println(isSuccessful)
}