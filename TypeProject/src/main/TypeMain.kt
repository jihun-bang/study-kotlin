package main

fun main(args: Array<String>) {
    val a: Byte = 127
    val b: Short = 30000
    val c: Int = 2000
    val d: Long = 230300000L // long 리터럴 literal
    val f: Float = 3.14F
    val g: Double = 3.14392
    val h1: Boolean = true
    val h2 = false
    val a2 = 1234 // Int
    val i = 'A' // Char Type Inference
    val i2: Char = 'B'
    val i3: Char
    i3 = 'C'
    val str: String = "ABC"

    println("Basic Types::")
    println("a = ${a} ${a.javaClass}")
    println("a = ${b} ${b.javaClass}")
    println("a = ${c} ${c.javaClass}")
    println("a = ${d} ${d.javaClass}")
    println("a = ${f} ${f.javaClass}")
    println("a = ${g} ${g.javaClass}")
    println("a = ${h1} ${h1.javaClass}")
    println("str = ${str} ${str.javaClass}")
    println("i = ${i} ${i.javaClass}")
}