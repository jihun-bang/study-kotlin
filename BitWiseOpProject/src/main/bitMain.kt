package main

fun main(args: Array<String>) {
    // XOR
    val input = args[0]
    val password = 0x1234_5678

    println("args = ${input} => ${input.length}")
    // 암호화 encryption
    println("\n암호화 encryption")

    val encrypted = Array(input.length, {0}) // 0, 0, 0, 0
    for ( (i, ch) in input.withIndex() ) { // (0, A), (1, B)...
        println("i = $i, ch = $ch, val = 0x${ch.toInt().toString(16)}")
        encrypted[i] = ch.toInt() xor password // 배타적 or
    }

    for ( en in encrypted) {
        println("en => ${en.toChar()} => $en")
    }
    // 복호화 decryption
    println("\n복호화 decryption")
    val decrypted = Array(input.length, {0})
    for ( (i, en) in encrypted.withIndex() ) {
        decrypted[i] = en xor password // 같은 패스워드 사용
    }

    for ( de in decrypted ) {
        println("de = ${de.toChar()}")
    }
}