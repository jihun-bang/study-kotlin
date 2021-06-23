fun main() {
    println(also())
    println(also2())
}

fun also(): User {
    val user = User(id = 1, name = "JiHun", level = 9999, job = "Master")
    return user.also { println("User Name = ${it.name}, Level = ${it.level}") }
}

fun also2(): User {
    val user = User(id = 1, name = "JiHun", level = 9999, job = "Master")
    return user.also {
        it.level = 1
        println("User Name = ${it.name}, Level = ${it.level}")
    }
}