package usability

fun main() {
    val name = "Bullets"
    println(name.h1())

    val person = Person(name = "Bullets", age = 33, address = "Korea, Seoul")
    println(person.info())
    println(person.addressInfo())
}

fun String.h1(): String {
    return "<h1>$this</h1>"
}

class Person(
    private val name: String,
    private val age: Int,
    val address: String
) {
    fun info() = "My name is $name, and I'm $age years old!"
}

fun Person.addressInfo() = "Come visit me in $address!"