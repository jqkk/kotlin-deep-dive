package basic.chapter02

/*
Kotlin 타입
- Byte, Short, Int, Long
- Float, Double
- Char
- String
- Boolean
 */

fun calculateCircleArea(radius: Double): Double {
    val pi = 3.14
    return radius * radius * pi
}

fun main(args: Array<String>) {
    val radius = 4.5
    val area = calculateCircleArea(radius)
    println("반지름이 $radius 인 원의 넓이는 $area 입니다.")
    val numberToString = 123.toString()
    println(numberToString is String)
}