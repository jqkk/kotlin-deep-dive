// https://school.programmers.co.kr/learn/courses/30/lessons/135808
package code.programmers

private fun solution(k: Int, m: Int, scoreArray: IntArray): Int {
    return scoreArray.asSequence().toList().sortedDescending().chunked(m).filter { it.size == m }
        .sumOf {
            (it.minOrNull() ?: 0) * m
        }
}

fun main() {

    println(solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1)))

    println(solution(1, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)))

}
