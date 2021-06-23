fun main() {
    runExample()
    runExample2()
}

fun runExample() {
    val user = User(id = 1, name = "JiHun", level = 10, job = "Developer")
    user.run {
        level = 100
        displayUser()
    }
}

fun runExample2() {
    val user = run {
        val id = 1
        val name = "JiHun"
        val level = 10
        val job = "Developer"

        User(id = id, name = name, level = level, job = job)
    }
    println(user)
}