package basic.chapter03

fun printNumArray(vararg numArray: Int){
    numArray.forEach {
        run {
            print(it)
        }
    }
}

fun main(args: Array<String>) {
    printNumArray(1,2,8,4,5,6)

    println()

    val array = intArrayOf(5,4,3,2,1)
    printNumArray(*array)
}