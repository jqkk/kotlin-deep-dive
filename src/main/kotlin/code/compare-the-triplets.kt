package code

fun compareTriplets(a: Array<Int>, b: Array<Int>): Pair<Int, Int> {
    var points = Pair(0, 0)
    if (a.size != b.size) {
        return points
    }
    a.forEachIndexed { index, i ->
        if (i > b[index]) {
            points = Pair(points.first + 1, points.second)
        } else if (i < b[index]) {
            points = Pair(points.first, points.second + 1)
        }
    }
    return points
}

fun main() {
    val aliceScore = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val bobScore = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(aliceScore, bobScore)

    println("${result.first} ${result.second}")
}