package my

val familyName = "Bang"
var givenName: String = "Jihun"
// varialbe
// constant

fun main(args: Array<String>) {
    givenName = "Jiho" // 재할당 reassign var
//    familyName = "Kim" Error:(10, 5) Kotlin: Val cannot be reassigned
    printMyName()
}

fun printMyName() {
    println("My name is ${givenName} $familyName")
}