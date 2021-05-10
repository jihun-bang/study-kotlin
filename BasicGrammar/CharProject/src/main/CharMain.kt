package main

fun main(args: Array<String>) {
    var a: Char = 'A'
    val aCodeVal = a.toInt()
    val b: Char = 'B'
    val bCodeVal = b.toInt()
    var c: Char = '\u0041'

    println("a = ${a} $aCodeVal, c = > $c")

    val d = 'A' + ' '.toInt()
    println("d = ${d}")
}