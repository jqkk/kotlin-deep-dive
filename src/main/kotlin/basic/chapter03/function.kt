package basic.chapter03

//fun foo(): Unit {
fun foo() {
    println("Unit return type")
}

//    fun calculateCircleArea(radius: Double) = radius * radius * 3.14

fun counting(count: Int){
    var count = count
    count++
    println(count)
}

fun main(args: Array<String>) {
    foo()
    counting(1)

    fun normalFunction (arg1: String, arg2: String): String {
        return arg1 + arg2
    }

    val anonymousFunction = fun(arg1: String, arg2: String): String {
        return arg1 + arg2
    }

    val lambdaFunction = {args1: String, args2: String -> args1 + args2 }

//    println({x: Int, y: Int -> x * x * y}(1,2))

}