// https://school.programmers.co.kr/learn/courses/30/lessons/142086
package code.programmers

private fun solution(s: String): IntArray {
    val tempList = mutableListOf<Char>()
    val result = IntArray(s.length)

    for (i in s.indices) {
        val currentValue = s[i]
        val absoluteIndex = tempList.lastIndexOf(currentValue)

        result[i] = if (absoluteIndex == -1) -1 else i - absoluteIndex

        tempList.add(currentValue)
    }

    return result
}

fun main() {
    println(solution("banana").contentToString())
    println(solution("foobar").contentToString())
}