package main

fun main(args: Array<String>) {
//    println ( 3+5)
    // live template
    println("3 + 7 = ${3 + 7}") // soutv
//    println("Hello World")
    helloWorld()
    "abcde".map { it.toUpperCase() }.forEach(::println)
}

fun helloWorld() {
    println("Hello Kotlin World!!")
}