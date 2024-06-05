package code

fun gradingStudents(grades: Array<Int>): Array<Int> = grades.map {
    if (it < 38 || it % 5 == 0) return@map it
    val multiplesOf5 = ((it / 5) + 1) * 5
    if (multiplesOf5 -it < 3) return@map multiplesOf5
    it
}.toTypedArray()

fun main() {
    val gradesCount = readln().trim().toInt()

    val grades = (0..<gradesCount).map {
        readln().trim().toInt()
    }.toTypedArray()

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))

}