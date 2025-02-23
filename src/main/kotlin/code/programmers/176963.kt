// https://school.programmers.co.kr/learn/courses/30/lessons/176963
package code.programmers

fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    val nameYearningMap = name.zip(yearning.toList()).toMap()

    val answer = photo.map {
        val score = it.fold(0) { acc, s ->
            acc + (nameYearningMap[s] ?: 0)
        }

        score
    }

    return answer.toIntArray()
}

fun main() {
    println(
        solution(
            arrayOf("may", "kein", "kain", "radi"),
            intArrayOf(5, 10, 1, 3),
            arrayOf(
                arrayOf("may", "kein", "kain", "radi"),
                arrayOf("may", "kein", "brin", "deny"),
                arrayOf("kon", "kain", "may", "coni")
            )
        ).toList()
    )

}

