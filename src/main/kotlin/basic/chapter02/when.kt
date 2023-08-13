package basic.chapter02

fun main(args: Array<String>) {
    if(args.isEmpty()){
        println("숫자를 입력해주세요.")
        return
    }

    val d = args[0].toInt()

    println(
        when {
            d == 1 -> "하나"
            d == 2 -> "둘"
            d == 3 -> "셋"
            d <= 0 -> "잘못된 입력입니다"
            else -> "그 외"
        }
    )

    when(d){
        1 -> println("일")
        2 -> println("이")
        3 -> println("삼")
        else -> println("잘못된 입력입니다")
    }
}