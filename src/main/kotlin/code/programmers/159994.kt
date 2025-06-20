// https://school.programmers.co.kr/learn/courses/30/lessons/159994
package code.programmers

fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
    val card1List = cards1.toMutableList()
    val cards2List = cards2.toMutableList()


    val hasAnswer = goal.all {
        when {
            card1List.isNotEmpty() && card1List.first() == it -> {
                card1List.remove(it)
                true
            }

            cards2List.isNotEmpty() && cards2List.first() == it -> {
                cards2List.remove(it)
                true
            }

            else -> false
        }
    }

    return if (hasAnswer) "Yes" else "No"

}

fun main() {
    println(
        solution(
            arrayOf("i", "drink", "water"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        )
    )

    println(
        solution(
            arrayOf("i", "water", "drink"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        )
    )
}