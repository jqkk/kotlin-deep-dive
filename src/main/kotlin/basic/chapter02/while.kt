package basic.chapter02

fun whileFunc(value: Int){
    var value = value
    println("I'm while Function")
    while(value < 10){
        println("value = $value")
        value += 1
    }
}

fun doWhileFunc(value: Int){
    var value = value
    println("I'm do while Function")
    do {
        println("value = $value")
        value += 1
    } while(value < 10)
}

fun main(args: Array<String>) {
    whileFunc(10)
    doWhileFunc(10)
}