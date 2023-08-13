package basic.chapter02

fun main(args: Array<String>) {
    if(args.isEmpty()) {
        println("숫자를 입력해주세요.")
        return
    }

    val d = args[0].toInt()

    println(
        if(d == 1) "하나"
        else if(d == 2) "둘"
        else if(d == 3) "셋"
        else if(d <= 0) "잘못된 입력입니다"
        else "그 외"
    )

    if(d == 1)
        println("일")
    else if(d == 2)
        println("이")
    else if(d == 3)
        println("삼")
    else if(d <= 0)
        println("잘못된 입력입니다")

}