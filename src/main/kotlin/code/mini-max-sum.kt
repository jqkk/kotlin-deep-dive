package code

fun miniMaxSum(arr: Array<Long>): Unit {
    val sortedArray = arr.sortedArray()
    val min = sortedArray.sliceArray(0..3).sum()
    val max = sortedArray.reversedArray().sliceArray(0..3).sum()
    println("$min $max")
}

fun main() {
    val arr = readln().trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    if (arr.size != 5) {
        throw Error("Invalid Input")
    }

    miniMaxSum(arr)
}