package basic.chapter02

fun main(args: Array<String>) {
    val sampleArray = arrayOf(1, 2, 6, 4, 5)

    println("First Value = ${sampleArray[0]}")

    for(i in sampleArray)
        println(i)

    println("Array size: ${sampleArray.size}")
    println(20 in sampleArray)

    val sampleArray2 = arrayOfNulls<Int>(10)
    println(sampleArray2.joinToString())

    val sampleArray3 = Array(10){ i -> i + 1 }
    // Array(10, { i -> i + 1 })
}