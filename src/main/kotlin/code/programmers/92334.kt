// https://school.programmers.co.kr/learn/courses/30/lessons/92334?language=kotlin
package code.programmers

fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val logs = report.toSet().map {
        val log = it.split(" ")
        log[0] to log[1]
    }

    val targetUserCount = logs.groupBy { it.second }.filter {
        it.value.count() >= k
    }.map {
        it.value
    }.flatten().map { it.first }.groupingBy { it }.eachCount()

    return id_list.map {
        targetUserCount[it] ?: 0
    }.toIntArray()
}

fun main() {
    val result = solution(
        arrayOf("muzi", "frodo", "apeach", "neo"),
        arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"), 2
    )
    println(result.joinToString(" "))
}