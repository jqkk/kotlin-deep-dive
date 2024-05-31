package code

fun plusMinus(arr: Array<Int>): Unit {
    // groupBy : Map<Int, List<Int>>
    // mapValues : Map<Int, String>
    arr.map {
        when {
            it > 0 -> 1
            it < 0 -> -1
            else -> 0
        }
    }.groupBy { it }.mapValues {
        String.format("%.6f", it.value.size.toDouble() / arr.size)
    }.let {
        println(it[1] ?: "0.000000")
        println(it[-1] ?: "0.000000")
        println(it[0] ?: "0.000000")
    }
}

fun main() {
    readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}