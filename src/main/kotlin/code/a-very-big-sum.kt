package code

val aVeryBigSum = { ar: Array<Long> ->
    ar.sum()
}

fun main(){
    readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}