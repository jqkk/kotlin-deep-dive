package code

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    val appleLocations = apples.map { it + a }
    val orangeLocations = oranges.map { it + b }

    // reflection 실습을 위해 함수를 추출함..
    fun isInRangeScopeOfHouse(n: Int): Boolean {
        return n in s..t
    }

    val appleCount = appleLocations.count(::isInRangeScopeOfHouse)
    val orangeCount = orangeLocations.count(::isInRangeScopeOfHouse)

    println(appleCount)
    println(orangeCount)
}

fun main() {
    // first input : Sam's house location(s, t)
    // second input : location of tree(a, b)
    // third input : number of apples and oranges(m, n)
    // fourth input : locations of apples
    // fifth input : locations of oranges

    val (s, t) = readln().trimEnd().split(" ").let {
        it.first().toInt() to it.last().toInt()
    }

    val (a, b) = readln().trimEnd().split(" ").let {
        it.first().toInt() to it.last().toInt()
    }

    readln()

    val appleDistances = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val orangeDistances = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    countApplesAndOranges(s = s, t = t, a = a, b = b, appleDistances, orangeDistances)
}