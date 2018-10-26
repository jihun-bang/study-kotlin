package numbers

fun main(args: Array<String>) {
    val a: Byte = 64
    val b: Short = 3000
    val c: Int = 60000
    val d: Long = 3243_2433_4243L
    val f: Float = 3.14F
    val g: Double = 3.14123 // 정밀도

    println("a = ${a} ${Byte.MIN_VALUE} ~ ${Byte.MAX_VALUE}")
    println("b = ${b} ${Short.MIN_VALUE} ~ ${Short.MAX_VALUE}")
    println("c = ${c} ${Int.MIN_VALUE} ~ ${Int.MAX_VALUE}")
    println("d = ${d} ${Long.MIN_VALUE} ~ ${Long.MAX_VALUE}")
    println("f = ${f} ${Float.MIN_VALUE} ~ ${Float.MAX_VALUE}")
    println("g = ${g} ${Double.MIN_VALUE} ~ ${Double.MAX_VALUE}")

    println(sumTwoNums(50, 70))
    println("sumTwoNumsToInt(100, 100) = ${sumTwoNumsToInt(100, 100)}")

}

fun sumTwoNums(first: Byte, second: Byte): Byte {
    return (first + second).toByte()
}

fun sumTwoNumsToInt(first: Byte, second: Byte): Int {
    return first + second
}