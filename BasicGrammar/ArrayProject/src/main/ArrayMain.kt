package main


fun main(args: Array<String>) {
    var a = Array<Int>(2, {0}) // Array( n, {fun} )
    val b = Array<Char>(3, {'_'}) // 타입 제한 인자 generic
    var c = Array<Int?>(4, {null})
    val d: Array<String> = args

    println("a.size = ${a.size} b.size = ${b.size} c.size = ${c.size} d.size = ${d.size}")

    println("a.get() = ${a.get(0)} b.get() = ${b.get(0)} c.get() = ${c.get(0)}")

    a.set(0, 100)
    a[0] = 50
    println("a[0] = ${a[0]}")

    println("a = ${a}")
    println("a.joinToString = ${a.joinToString(", ") }")

    // 표준 라이브러리 함수
    val f1 = arrayOf<String>("banana", "apple", "orange")
    val f2: Array<String> = Array(3, {"_"})
    f2[2] = "plum"
//    val fruitsArray = f1 + f2
    val fruitsArray = arrayOf<String>(*f1, *f2)
    println("f1 + f2 = ${fruitsArray.joinToString(", ")}")

    val coffeeCup = IntArray(3, {i -> i * 2000 + 1000 })
    for ( cc in coffeeCup) {
        println("cc = ${cc}")
    }
    println("coffeeCup.sum = ${coffeeCup.sum()}")
    println()

    var sdSum:Double = 0.0
    for ( (i, sd) in coffeeCup.withIndex()) {
        println("sd[$i] = ${sd}")
        sdSum += sd
    }
    println("sdSum = ${sdSum}")
    println("sdSum / coffeeCup.size = ${sdSum / coffeeCup.size}, ${coffeeCup.average()}")

    println()
    for ( (i, cc) in coffeeCup.withIndex()) {
        if( cc > 1000) println("cc = ${cc}")
    }
    println()

    println("coffeeCup.filter { it > 1000 } = ${coffeeCup.filter { it > 1000 }}")
    println("coffeeCup = ${coffeeCup.find { it > 1000 }}")
}





