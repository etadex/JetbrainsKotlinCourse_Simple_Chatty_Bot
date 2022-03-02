fun main() {
    val students: Int = readLine()!!.toInt()
    var gradeA: Int = 0
    var gradeB: Int = 0
    var gradeC: Int = 0
    var gradeD: Int = 0
    repeat(students) {
        val next: Int = readLine()!!.toInt()
        if (next == 5) {
            gradeA += 1
        } else {
            if (next == 4) {
                gradeB += 1
            } else {
                if (next == 3) {
                    gradeC += 1
                } else {
                    if (next == 2) {
                        gradeD += 1
                    } else {
                        println("some grades are invalid!")
                    }
                }
            }
        }
    }
    println("$gradeD $gradeC $gradeB $gradeA")
}