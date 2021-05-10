package main

fun main(args: Array<String>) {

    do {
        println("HelloWorld")
    } while (false)

    val numbers2dOrdered
            = Array(3,{ i -> IntArray(4, { j -> j + i * 4 } ) } )

    for ( (i, row) in numbers2dOrdered.withIndex()) {
        for ((j, column) in row.withIndex()) {
            print("[$i, $j] = $column\t")
        }
        println()
    }

    var i: Int = 0
    abc@ while ( i < 100) {
        i++
        if ( i == 50) {
            break@abc
        }
        println("$i")
    }
}