package code

import kotlin.math.sqrt

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

fun getDivisorsCount(n: Int): Int {
    if (n == 1) return 1
    else if (n == 2 || n == 3) return 2

    val sqrtOfN = sqrt(n.toDouble()).toInt()

    return (1..sqrtOfN).fold(initial = 0, operation = fun(acc: Int, i: Int): Int {
        if (i * i == n) return acc + 1
        else if (n % i == 0) return acc + 2
        return acc
    })
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {

    val theLeastCommonMultipleOfArrayA = a.reduce { acc, element -> acc * element / gcd(acc, element) }
    val theGreatestCommonFactorOfArrayB = b.reduce { acc, element -> gcd(acc, element) }

    if (theGreatestCommonFactorOfArrayB % theLeastCommonMultipleOfArrayA != 0) return 0

    return getDivisorsCount(theGreatestCommonFactorOfArrayB / theLeastCommonMultipleOfArrayA)
}

fun main() {
    readln()

    val a = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val b = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(a = a, b = b)

    println(total)
}

// n1과 n2는 자연수!!

// a의 최소 공배수 * n1 = p
// b의 최대 공약수 = p * n2 => 최대 공약수 / n2 = p

// 최대 공약수 / n2 = 최소 공배수 * n1
// 최대 공약수 / a의 최소 공배수 = n1 * n2

// b의 최대 공략수 = 12
// a의 최소 공배수 = 6

// n1 * n2 = 2

// 1 or 2

// 약수의 개수 구하기