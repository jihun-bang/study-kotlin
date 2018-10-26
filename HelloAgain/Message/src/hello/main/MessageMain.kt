package hello.main

import hello.msgs.sayHello

fun main(args: Array<String>) {
    val msg1 = "Hello"
    val msg2 = "안녕하세요"

    println(msg1 + " Kotlin!")
    sayHello("Mr.코틀린")
}