package code

fun <T> combine(
    list: List<T>,
    r: Int,
    start: Int = 0,
    current: List<T> = emptyList(),
    result: MutableList<List<T>> = mutableListOf()
): List<List<T>> {
    println(current)
    if (current.size === r) result.add(current)
    else {
        for (i in start until list.size) {
            combine(list, r, i + 1, current + list[i], result)
        }
    }
    return result
}


fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    return 0
}

fun main() {
    val (n, k) = readln().trimEnd().split(" ").map { it.toInt() }.let {
        it[0] to it[1]
    }

    val ar = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}