//https://school.programmers.co.kr/learn/courses/30/lessons/77884
package code.programmers

import kotlin.math.sqrt

fun solution(left: Int, right: Int): Int {
    return (left..right)
        .reduce { acc, i -> if (sqrt(i.toDouble()).let { it == it.toInt().toDouble() }) acc - i else acc + i }
}


fun main() {
    val result = solution(1, 1000)
    println(result)
}