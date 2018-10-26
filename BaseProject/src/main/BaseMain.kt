package main

fun main(args: Array<String>) {
    // Base, radix
    val a = 255 // decimal
    val b = 0xFF // 0~9, A~F
    val b2 = 0xF0 + 0x0F
    val b3 = '\u00FF'
    val c = 0b1111_1111
    println("c = ${c}")
}