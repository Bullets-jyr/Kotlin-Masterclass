package usability.dataclasses

fun main() {
    val person = Person(name = "Bullets", age = 33)
//    val person2 = person.copy(age = 30)
//    println(person2.toString())

//    val person2 = Person(name = "Bullets", age = 33)
//    println(person.equals(person2))
//    val person = Person("Bullets")
//    val person2 = Person("Bullets")
//    person.age = 20
//    person2.age = 30
//    println(person.equals(person2))

    val (name, age) = person
    println(name)
    println(age)
}

data class Person(
    val name: String,
    val age: Int
)

//data class Person(
//    val name: String
//) {
//    var age: Int = 0
//}
