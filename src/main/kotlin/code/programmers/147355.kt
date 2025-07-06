// https://school.programmers.co.kr/learn/courses/30/lessons/147355
package code.programmers

private fun <T> permutations(list: List<T>, r: Int): List<List<T>> {
    if (r == 0) return listOf(emptyList())
    if (list.isEmpty()) return emptyList()

    val result = mutableListOf<List<T>>()

    for (i in list.indices) {
        val currentValue = list[i]
        val remainingList = list.toMutableList().apply { removeAt(i) }
        for (perm in permutations(remainingList, r - 1)) {
            result.add((listOf(currentValue) + perm))
        }
    }

    return result
}

private fun solution(t: String, p: String): Int {
    val n = p.length
    val target = p.toLong()

    return (0..t.length - n).count {
        t.substring(it, it + n).toLong() <= target
    }

}

fun main() {
    println(solution("500220839878", "271"))

}

