fun main() {
    with()
}

fun with() {
    val user = User(id = 1, name = "JiHun", level = 10, job = "Developer")

    with(user) {
        println("user = $this")
        println("name = $name")
        displayUser()
    }
}