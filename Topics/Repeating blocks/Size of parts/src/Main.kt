fun main() {
    val productionLength: Int = readLine()!!.toInt()
    val perfRef: Int = 0
    val largRef: Int = 1
    val smallRef: Int = -1
    var perfComp: Int = 0
    var largComp: Int = 0
    var rejections: Int = 0
    repeat(productionLength) {
        val next: Int = readLine()!!.toInt()
        if (next == perfRef) perfComp++ else if (next == largRef) largComp++ else if (next == smallRef) rejections++
    }
    println("$perfComp $largComp $rejections")
}