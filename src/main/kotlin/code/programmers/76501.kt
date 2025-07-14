// https://school.programmers.co.kr/learn/courses/30/lessons/76501
package code.programmers

fun solution(absolutes: IntArray, sign: BooleanArray): Int {
    return absolutes.mapIndexed { index, i -> if (sign[index]) i else -i }.sum()
}

fun main() {
    println(solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)))
    println(solution(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true)))

}

