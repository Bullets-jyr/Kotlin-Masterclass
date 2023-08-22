package usability.destructuringDeclarations

fun main() {
//    val pair = Pair(first = 1, second = "Bullets")
//    println(pair.first)
//    println(pair.second)

//    val (id, name) = pair
//    println(id)
//    println(name)

    val person = Person(name = "Bullets", age = 33, address = "Korea, Seoul")
    val (_, age, _) = person

    val map = mapOf(1 to "One")
//    val (number, text) = map
    for ((number, text) in map) {
        println(number)
        println(text)
    }
}

data class Person(
    val name: String,
    val age: Int,
    val address: String
)