package code

import java.io.Serializable

data class Quadruple<A, B, C, D>(var first: A, var second: B, var third: C, var fourth: D) : Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth)"
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if(v1 == v2 || x1 == x2) return "NO"

    val n = (x2 - x1).toDouble() / (v1 - v2).toDouble()
    if(n < 0 || n.toInt().toDouble() != n){
        return "NO"
    }
    return "YES"
}

fun main() {
    val (x1, v1, x2, v2) = readln().split(" ").let {
        Quadruple(it[0].toInt(), it[1].toInt(), it[2].toInt(), it[3].toInt())
    }

    val result = kangaroo(x1, v1, x2, v2)
    println(result)

}