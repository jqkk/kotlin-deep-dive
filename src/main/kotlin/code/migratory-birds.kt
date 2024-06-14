package code

fun migratoryBirds(arr: Array<Int>): Int {
    val migratoryBirdsCountMap = arr.groupingBy { it }.eachCount()
    return migratoryBirdsCountMap.maxOf { it.value }.let { maxValue ->
        migratoryBirdsCountMap.filterValues { it == maxValue }.minOf { it.key }
    }
}

fun main() {
    readln()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}