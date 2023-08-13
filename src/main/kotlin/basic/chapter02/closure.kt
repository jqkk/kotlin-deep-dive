package basic.chapter02

fun main(args: Array<String>) {
    val cumulative = fun(value: Int): (Int) -> Int {
        var sum: Int  = value
        return {
            val temp = sum
            sum += it
            temp
        }
    }

    val func = cumulative(5)
    println(func(3))
    println(func(2))
    println(func(1))
}