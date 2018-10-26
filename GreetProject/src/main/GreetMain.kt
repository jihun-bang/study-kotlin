package main

import message.Greeting

fun main(args: Array<String>) {
    val g1 = Greeting("지훈", "안녕")
    val g2 = Greeting(to = "JIN-YANG")

    g1.sayHello()
    g1.sayHello("진양")
    g1.sayHelloTo("지호")

    g2.sayHello()
    g2.sayHello("JI-HUN")
    g2.sayHelloTo("지호")
}