package code.programmers

fun solution(k: Int, score: IntArray): IntArray {
    val result = mutableListOf<Int>()

    for (index in score.indices) {
        val rankingArray = score.sliceArray(0 until index + 1).sortedDescending()

        if (rankingArray.size <= k) {
            result.add(rankingArray.last())
        } else {
            result.add(rankingArray[k - 1])
        }

    }

    return result.toIntArray()
}

fun main() {
    println(solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).contentToString())

    println(solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)).contentToString())

}