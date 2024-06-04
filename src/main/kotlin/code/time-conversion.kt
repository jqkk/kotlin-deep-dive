package code

fun timeConversion(s: String): String {
    val meridiem = s.takeLast(2)
    val time = s.dropLast(2)

    val hours = time.take(2)
    val others = time.drop(2)

    return when (meridiem) {
        "AM" -> (if(hours.toInt() == 12) "00" else hours) + others
        "PM" -> (if(hours.toInt() == 12) hours else (hours.toInt() + 12).toString()) + others
        else -> ""
    }
}

fun main() {
    val s = readln().trim()

    val result = timeConversion(s)

    println(result)
}