package hello

import other.*

fun main(args: Array<String>) {

    sayHello()
    sayHelloMsg1("코틀린")
    sayHelloMsg2("Kotlin")
}

fun sayHello() {
    val msg = " Again!!"
//    println("Hello Again!")
    println("Hello" + msg)
}

