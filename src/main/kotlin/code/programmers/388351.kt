// https://school.programmers.co.kr/learn/courses/30/lessons/388351
package code.programmers

import java.time.LocalTime

fun getTime(time: Int): LocalTime {
    return LocalTime.of(time / 100, time % 100)
}

fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {

    val saturdayIndex = if (startday == 7) 6 else 6 - startday
    val sundayIndex = 7 - startday

    val answer = timelogs.mapIndexed { index, arr -> index to arr }
        .count { (index, arr) ->
            val schedule = schedules[index]

            val endTime = getTime(schedule).plusMinutes(10)

            val arrayWithOutHoliday = arr.filterIndexed { index, _ -> index != saturdayIndex && index != sundayIndex }
            
            arrayWithOutHoliday.all {
                val workTime = getTime(it)

                endTime.isAfter(
                    workTime
                ) || endTime.equals(workTime)
            }
        }

    return answer
}

fun main() {
    val answer = solution(
        intArrayOf(700, 800, 1100),
        arrayOf(
            intArrayOf(710, 2359, 1050, 700, 650, 631, 659),
            intArrayOf(800, 801, 805, 800, 759, 810, 809),
            intArrayOf(1105, 1001, 1002, 600, 1059, 1001, 1100)
        ),
        5
    )

    println(answer)

}