package code

import kotlin.math.abs

val diagonalDifference = { arr: Array<Array<Int>> ->
    val leftDiagonalSum = arr.indices.sumOf { arr[it][it] }
    val rightDiagonalSum = arr.indices.sumOf { arr[it][arr.lastIndex - it] }
    abs(leftDiagonalSum - rightDiagonalSum)
}

fun main() {
    val n = readln().trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }.map { readln().trim().split(" ").map { it.toInt() }.toTypedArray() }.toTypedArray()

    val result = diagonalDifference(arr)

    println(result)
}