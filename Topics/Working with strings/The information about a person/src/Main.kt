import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val name: String = scanner.next()
    val surname: String = scanner.next()
    val age: Int = scanner.nextInt()
    println(name.first() + ". $surname, $age years old")
}