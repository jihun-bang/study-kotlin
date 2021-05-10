package main

fun main(args: Array<String>) {
    val a: Any = 1234 // Kotlin.Any 최상위 타입 클래스 => java Object 비슷
    val a2: Any = 'A'
    var a3: Any = "xyz"

    a3 = 3.141592
    a3 = true

    val b2 = a is Int

    println("b2 = ${b2}") // is type check => java instanceOf 와 비슷
    println("a3 is String = ${a3 is String}")
    println("a3 is String = ${a3 is Boolean}")

    if( a2 is Char) {
        println("a2 is Char = ${a2}")
    }

    var c: Int = 123
    // cast 타입을 강제 변환
//    val d: Byte = c as Byte // ClassCastException 예외

    val d: Byte = 64
    val d1: Int = d.toInt()

    whichType(a)
    whichType("hello")
    whichType(true)
    whichType(3.14f)
}

fun whichType(data: Any) {
    if (data is String) {
        println("data = ${data.length}")
//        val result: String = data as String
//        println("result.length = ${result.length}")
    }
    else if (data is Int) {
        val result: Int = data as Int
        println("result * 2 = ${result*2}")
    }
    else {
        println("${data.javaClass}")
        val result = data as? Float
        println("result = ${result}")
    }
}