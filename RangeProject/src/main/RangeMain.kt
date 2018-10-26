package main

// Range <==> Array
fun main(args: Array<String>) {
    val naturalNumbers = 1..100 // 1,2,3...100
    val r = 1..(99+1)
    val r2 = IntRange(1, 100)
    val r3 = 1.. 100-1
    val r4 = 1 until 101
    val r5 =  (100 downTo 1).step(20)

    val arr1: IntArray = r.toList().toIntArray()
    val arr2: Array<Int> = r.toList().toTypedArray()

    println("r5 = ${r5.joinToString(", ")}")
    println("r.last = ${r.last}")

    println()
    //printGuGuDan()
    sumOfBetweenInts(1, 50)
    sumOfBetweenInts(100, 10)
}

fun printGuGuDan() {
    for( dan in 2..9 ) {
        println("dan = ${dan}")
        for( n in 1..9 ) {
            println("dan * n = ${dan * n}")
        }
        println()
    }
}

fun sumOfBetweenInts(start: Int, end: Int) {
    when {
        end >= start -> {
            val range = start..end
            println("range.sum() = ${range.sum()}")
        }
        else -> println("순반향만 가능")
    }
}








