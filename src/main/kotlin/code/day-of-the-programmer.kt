package code

fun dayOfProgrammer(year: Int): String {
    val isJulianLeaf = year < 1918 && year % 4 == 0
    val isGregorianLeaf = year >= 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))

    val commonDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31
    if (year == 1918) {
        return "26.09.1918"
    }


    if (isJulianLeaf || isGregorianLeaf) {
        return "${256 - commonDays -1 }.09.$year"
    }

    return "${256 - commonDays}.09.$year"
}

fun main() {
    val year = readln().trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}