package basic.chapter02

fun main(args: Array<String>) {
    val square: (Int) -> Int = { it * it }
    println(square(2))
}