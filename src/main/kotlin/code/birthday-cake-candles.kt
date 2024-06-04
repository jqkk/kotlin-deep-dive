package code

fun birthdayCakeCandles(candles: Array<Int>): Int {
    return candles.groupingBy { it }.eachCount().maxOf { it.value }
}

fun main(args: Array<String>) {
    readln().trim().toInt()

    val candles = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}