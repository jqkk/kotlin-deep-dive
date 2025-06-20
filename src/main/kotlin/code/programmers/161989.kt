// https://school.programmers.co.kr/learn/courses/30/lessons/161989
package code.programmers

fun solution(n: Int, m: Int, section: IntArray): Int {
    val paintArray = booleanArrayOf(
        *BooleanArray(n) { true }
    )

    section.forEach { paintArray[it - 1] = false }

    var paintCount = 0

    while (true) {
        val startIndex = paintArray.indexOfFirst { it === false }
        if (startIndex == -1) break

        var endIndex = startIndex + m - 1
        if (endIndex >= n) endIndex = n - 1

        for (i in startIndex..endIndex) {
            paintArray[i] = true
        }
        paintCount++
    }



    return paintCount
}

fun main() {
    println(solution(8, 4, intArrayOf(2, 3, 6)))

    println(solution(5, 4, intArrayOf(1, 3)))

    println(solution(4, 1, intArrayOf(1, 2, 3, 4)))
}


