package code

fun breakingRecords(scores: Array<Int>): IntArray {
    var minCount = 0;
    var maxCount = 0;

    scores.reduce(fun(acc: Int, cur: Int): Int {
        if (acc < cur) {
            maxCount += 1
            return cur
        }
        return acc;
    })

    scores.reduce(fun(acc: Int, cur: Int): Int {
        if (acc > cur) {
            minCount += 1
            return cur
        }
        return acc
    })

    return intArrayOf(maxCount, minCount)
}

fun main() {
    readln()

    val scores = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}