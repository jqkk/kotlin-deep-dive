package basic.chapter04

class Student(private val name: String, private val year: Int, private val major: String){
    fun getProfile(): String = "이름 : $name, 나이 : $year, 전공: $major"
}

fun main(args: Array<String>) {
    val I = Student("KimKyungji", 24, "Software")
    println(I.getProfile())
}