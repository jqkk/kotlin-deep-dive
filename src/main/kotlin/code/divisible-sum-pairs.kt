package code

fun <T> combine(
    list: List<T>,
    r: Int,
    start: Int = 0,
    current: List<T> = emptyList(),
    result: MutableList<List<T>> = mutableListOf()
): List<List<T>> {
    if (current.size == r) result.add(current)
    else {
        for (i in start until list.size) {
            combine(list, r, i + 1, current + list[i], result)
        }
    }
    return result
}

// 1, 2, 3, 4
// 4C2

// 1, 2
// 1, 3
// 1, 4

// 2, 3
// 2, 4

// 3, 4

// 한 번 뽑은 건 다시 뽑지 않는다

/*
 start: 1, current: [1]
    start: 2, current: [1, 2]
    start: 3, current: [1, 3]
    start: 4: current: [1, 4]

 start: 2, current: [2]
    start: 3, current: [2, 3]
    start: 4, current: [2, 4]

 start: 3, current: [3]
    start: 4, current: [3, 4]

 start: 4, current: [4]
*/

// 4C3

// 1, 2, 3
// 1, 3, 4
// 1, 2, 4

// 2, 3, 4

/*
 start: 1, current: [1]
    start: 2, current: [1, 2]
        start: 3, current: [1, 2, 3]
        start: 4, current: [1, 2, 4]
    start: 3, current: [1, 3]
        start: 4, current: [1, 3, 4]

 start: 2, current: [2]
    start: 3, current: [2, 3]
        start: 4, current: [2, 3, 4]
    start: 4, current: [2, 4]

 start: 3, current: [3]
    start: 4, current: [3, 4]

 start: 4, current: [4]
*/

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    return combine(ar.toList(), 2)
        .filter { it.sum() % k == 0 }
        .size
}

fun main() {
    val (n, k) = readln().trimEnd().split(" ").map { it.toInt() }.let {
        it[0] to it[1]
    }

    val ar = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}