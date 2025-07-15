// https://school.programmers.co.kr/learn/courses/30/lessons/140108
package code.programmers

private fun solution(s: String): Int {
    var firstChar = s[0]
    var same = 0
    var other = 0
    var result = 0

    for (index in s.indices) {
        if (same == other) {
            result++
            firstChar = s[index]
        }

        if (firstChar == s[index]) {
            same++
        } else {
            other++
        }

    }

    return result
}

fun main() {
    println(solution("banana"))
    println(solution("abracadabra"))
    println(solution("aaabbaccccabba"))
}