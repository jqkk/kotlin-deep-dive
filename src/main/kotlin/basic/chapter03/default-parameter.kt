package basic.chapter03

fun defaultParameter(name: String = "John", age: Int = 20) {
    println("name: $name, age: $age")
}

fun main(args: Array<String>) {
    defaultParameter()
    defaultParameter("Jane")
    defaultParameter("Jane", 30)
    defaultParameter(age = 30)
}