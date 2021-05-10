package main

fun main(args: Array<String>) {
    val a = !true //-1 // +1 => unaryPlus()

    val b = 3.14f * 33 //20L - 3//3 + 4
    val c = 21 % 10 // mod, rem
    val d = 21.mod(10)
    val d2 = 21.rem(10)

    val e = (5 * 2 - 5) / 5

    println("c = ${c}")
    println("d = ${d}")
    println("d2 = ${d2}")
    println("e = ${e}")

    val h = 300 > 100

    println("h = ${h}")

    val i = 3 in 1..10

    println("i = ${i}")

}