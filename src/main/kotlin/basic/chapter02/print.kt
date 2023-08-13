package basic.chapter02

fun main(args: Array<String>){
    val args = args.joinToString { i ->  i.uppercase() }
    println("안녕 세상 $args")
}