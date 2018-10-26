package main

fun main(args: Array<String>) {
    var a: String = "ABCD" // non-null type
//    a = null // error
    var b: String? = "XYX" // nullable type
    b = null

    println("a.length = ${a.length}")
//    println("b.length = ${b.length}") // null 일수도 있기에 error
    println("b?.length = ${b?.length}") // safe call => null
    // nullable or null 무조건 참조/호출
//    println("b!!.length = ${b!!.length}") // kotlin.KotlinNullPointerException
//
//    println("b.length = ${
//        if(b != null) b.length
//        else "length don't know"
//    }")

    println("b?.length? : ${b?.length ?: " $b length don't know"}")

    println(joinForm("방지훈", 27))
    println(joinForm(null, 27) ?: "가입 내용 누락")

}

fun joinForm(name: String?, age: Int): String? {
    return if (name != null) "$name 가입 ($age 세)"
    else null
}