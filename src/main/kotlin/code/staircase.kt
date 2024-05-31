package code

fun main() {
    val n = readln().trim().toInt()

    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(i))
    }
}