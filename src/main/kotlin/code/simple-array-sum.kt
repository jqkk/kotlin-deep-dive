package code

val simpleArraySum = { ar: Array<Int> ->
    ar.sum()
}

fun main() {
    // readLint: null을 허용함
    // readLn: null을 허용하지 않음
    readln().trim().toInt()

    // map return type: List<Int>
    // toTypedArray return type: Array<Int>
    val ar = readln().trimEnd().split(" ").map {
        it.toInt()
    }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}