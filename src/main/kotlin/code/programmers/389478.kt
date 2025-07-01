// https://school.programmers.co.kr/learn/courses/30/lessons/389478
package code.programmers

fun getBoxFloor(boxCount: Int, boxWidth: Int) = boxCount / boxWidth + if (boxCount % boxWidth == 0) 0 else 1

fun getBoxPosition(boxCount: Int, boxWidth: Int) = if (boxCount % boxWidth == 0) boxWidth else boxCount % boxWidth

fun getIsSameBoxDirection(lastBoxFloor: Int, targetBoxFloor: Int) = lastBoxFloor % 2 == targetBoxFloor % 2

private fun solution(n: Int, w: Int, num: Int): Int {
    // n : 놓은 상자의 총 개수
    // w : 상자의 가로
    // num : 꺼내려는 상자 번호

    val lastBoxFloor = getBoxFloor(n, w)
    val targetBoxFloor = getBoxFloor(num, w)

    val isSameDirection = getIsSameBoxDirection(lastBoxFloor, targetBoxFloor)

    val lastBoxPosition = getBoxPosition(n, w)
    val targetBoxPosition = if (isSameDirection) {
        getBoxPosition(num, w)
    } else {
        w - getBoxPosition(num, w) + 1
    }

    val answer: Int = lastBoxFloor - targetBoxFloor + 1 - if (lastBoxPosition < targetBoxPosition) 1 else 0
    return answer
}

fun main() {
    val solution = solution(13, 3, 6)
    println(solution)
}