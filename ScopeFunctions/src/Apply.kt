fun main() {
    notApply()
    apply()
}

fun notApply() {
    val user = User(id = 1, name = "JiHun")
    user.level = 1000
    user.job = "Developer"

    println(user)
}

fun apply() {
    val user = User(id = 1, name = "JiHun").apply {
        level = 1000
        job = "Developer"
    }
    println(user)
}