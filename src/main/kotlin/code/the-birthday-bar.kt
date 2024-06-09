package code

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    return s.foldIndexed(0, fun(index: Int, acc: Int, _: Int): Int {
        if (s.size - index >= m && s.slice(index..<index + m).sum() == d) {
            return acc + 1
        }
        return acc
    })
}

fun main() {
    readln()

    val s = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val (d, m) = readln().trimEnd().split(" ").map { it.toInt() }.let {
        it[0] to it[1]
    }

    val result = birthday(s, d, m)

    println(result)
}