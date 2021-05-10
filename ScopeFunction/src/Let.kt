fun main() {
    val users = getUsers()
    println("Local")
    notLetLocal(users)
    letLocal(users)

    println("Null Check")
    notLetNullCheck(users)
    letNullCheck(users)
}
fun notLetNullCheck(users: List<User>) {
    users.forEach { user ->
        if (user.job != null) {
            println("User = $user")
        }
    }
}

fun letNullCheck(users: List<User>) {
    users.forEach { user ->
        user.job?.let { println("User = $it") }
    }
}

fun notLetLocal(users: List<User>) {
    val jobUsers = users.filter { it.job != null }
    jobUsers.forEach { println(it.name) }
    val names = jobUsers.map { it.name }
    println(names)
}

fun letLocal(users: List<User>) {
    val names = users.filter { it.job != null }.let { jobUsers ->
        jobUsers.forEach { println(it.id) }
        jobUsers.map { it.name }
    }
    println(names)
}

fun getUsers(): List<User> {
    val users = mutableListOf<User>()
    for (i in 0..10) {
        users.add(
            User(id = i, name = "JiHun$i", level = i, job = if (i % 2 == 0) "Job $i" else null)
        )
    }
    return users
}