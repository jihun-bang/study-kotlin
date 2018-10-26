package main

fun main(args: Array<String>) {
    var a = 124
    when(a) {
        !in 10..200 -> println("a 범위 밖")
        !is Int -> println("a 타입은 not Int")
//        is kotlin.Int -> println("a 타입 Int")
        123 -> println("a = 123")
        else -> println("a 는 어느 경우도 아님")
    }

    // Condition 없을 시 true or false
    val s: String? = when {
        false -> "실행 x"
        'z'.isDigit() -> "z = 숫자"
//        'z'.isLetter() -> "z = 문자"
//        true -> "실행"
        else -> null
    }
    println("s = ${s ?: "도달 불가"}") // elvis

    calculateValue("",3, 4)
    calculateValue("+", 1, 1)
    calculateValue("minus", 300, 200)
    calculateValue("times", 10, 50)
    calculateValue("diva", 100, 2)
    calculateValue("@", 60, 2)
}

fun calculateValue(op: String, first: Int, second: Int) {
    when(op) {
        "" -> println("op = 누락")
        "plus", "+"-> println("first + second = ${first + second}")
        "minus", "-" -> println("first - second = ${first - second}")
        "times", "*", "x" -> println("first * second = ${first * second}")
        "divide", "/" -> println("first / second = ${first / second}")
        "average", "@" -> println("average = ${(first + second) / 2.0}")
        else -> println("op = ${op} 는 처리 불가")
    }
}