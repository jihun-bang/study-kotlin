import my.familyName
import my.givenName

fun main(args: Array<String>) {
    val favNumber: Int = 7
//    favNumber = 3 // err
    var myAge = 27
    myAge += 1

    println(myAge)
    println("favNumber = ${favNumber.inc()}")
    println("favNumber = ${favNumber}")

    givenName = "John"
    my.givenName = "Alice"
//    familyName = "Kim" //
    my.printMyName()
}