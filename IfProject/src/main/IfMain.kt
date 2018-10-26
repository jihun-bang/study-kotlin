package main

fun main(args: Array<String>) {
    var a: Int = 0
    a = 122
    a++

    if (true) {
        a = 200
        a--
    }

    if(false) a = -1

    println("a = ${a}")

    // 식 표현 expression
    val numberType =
            if (a % 2 == 1) {
                "a = ${a} => odd number"
            }
            //if (a % 2 == 0 ) {
            else {
                "a = ${a} => even number"
            }

    println("numberType = ${numberType}")

    println(getAbsoluteValue(10, 20))
    println(getAbsoluteValue2(20, 10))
    println(getAbsoluteValue3(15, 50))
}

fun getAbsoluteValue(num1: Int, num2: Int): Int {
    val result = if (num1 >= num2) num1 - num2
    else num2 - num1

    return result
}

fun getAbsoluteValue2(num1: Int, num2: Int): Int {
    return if (num1 >= num2) num1 - num2
    else num2 - num1
}

fun getAbsoluteValue3(num1: Int, num2: Int)
    = if (num1 >= num2) num1 - num2
        else num2 - num1