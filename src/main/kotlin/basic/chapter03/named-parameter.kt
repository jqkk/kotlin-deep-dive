package basic.chapter03

fun example(x: Int=1, y: Int=2, z: Int=3){
    println("$x $y $z")
}

fun main(args: Array<String>) {
    example(y=8)
}