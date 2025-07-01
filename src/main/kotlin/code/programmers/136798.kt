// https://school.programmers.co.kr/learn/courses/30/lessons/136798
package code.programmers

import kotlin.math.sqrt

private fun getDivisorCount(number: Int): Int {
    var divisorCount = 0
    for (i: Int in 1..sqrt(number.toDouble()).toInt()) {
        if (i * i == number) divisorCount++
        else if (number % i == 0) divisorCount += 2
    }

    return divisorCount
}

private fun solution(number: Int, limit: Int, power: Int): Int {
    return IntArray(number) { it + 1 }.sumOf {
        val divisorCount = getDivisorCount(it)
        if (divisorCount > limit) power else divisorCount
    }
}


fun main() {
    println(solution(5, 3, 2))

    println(solution(10, 3, 2))
}

