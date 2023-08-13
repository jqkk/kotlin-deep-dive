package basic.chapter02

fun main(args: Array<String>) {
    for(i in 1..9){
        println("$i 단 시작 ************")
        for(j in 1..10)
            println("i * $j = ${i * j}")
    }
}