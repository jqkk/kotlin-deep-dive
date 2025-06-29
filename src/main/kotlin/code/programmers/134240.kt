package code.programmers

fun solution(food: IntArray): String {
    val foodCountsWithoutWater = food.slice(1 until food.size)
    val actualFoodCountsWithoutWater = foodCountsWithoutWater.map {
        if (it % 2 == 0) {
            it
        } else {
            it - 1
        }
    }

    var halfString = ""
    for (index in actualFoodCountsWithoutWater.indices) {
        repeat(actualFoodCountsWithoutWater[index] / 2) {
            halfString += index + 1
        }

    }

    val result = halfString + "0" + halfString.reversed()

    return result
}

fun main() {
    println(solution(intArrayOf(1, 3, 4, 6)))
    println(solution(intArrayOf(1, 7, 1, 2)))

}