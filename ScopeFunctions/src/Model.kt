data class User (
    val id: Int = 0,
    val name: String = "",
    var level: Int = 0,
    var job: String? = null
) {
    fun displayUser() {
        println(this)
    }
}