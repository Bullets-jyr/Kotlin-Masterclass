package usability.nullabletypes

fun main() {
    val map = mapOf(1 to "One")
    val result = map[2]
    println(result)

    val regularString = "abc"
//    val text: String = null

    val nullableString: String? = null
    val text2: String? = regularString
//    val text3: String = text2

    if (nullableString != null) {
        println(nullableString.length)
    }

    val person = Person(name = "Bullets", age = 33)
    val nullablePerson: Person? = null
}

data class Person(
    val name: String,
    val age: Int
)