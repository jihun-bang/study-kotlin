package message

class Greeting(val to: String = "JI-HUN", val msg: String = "Hello") {
    fun sayHello() {
        println()
        println("${to} ${msg}!")
    }

    fun sayHello(name: String) { // Function Overloading
        println()
        println("${name} ${msg}!")
    }

    fun sayHelloTo(name: String) {
        println()
        println("${name} ${msg}!")
    }
}