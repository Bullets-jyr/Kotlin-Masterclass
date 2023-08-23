package Functionalprogramming

fun main() {
    val people = listOf<Person>(
        Person(name = "John", age = 20, male = true),
        Person(name = "Michael", age = 21, male = true),
        Person(name = "Sam", age = 22, male = true),
        Person(name = "Ana", age = 23, male = false),
        Person(name = "Jennifer", age = 24, male = false),
    )

//    people.filter { person -> person.male }.forEach {
//        println(it.name)
//    }
//    people.filter { person -> !person.male }.forEach {
//        println(it.name)
//    }

//    people.filter(Person::male).forEach { println(it.name) }
//    people.filterNot(Person::male).forEach { println(it.name) }

//    people.sortedBy(Person::age).forEach { println(it.name) }
//    people.sortedByDescending(Person::age).forEach { println(it.name) }

//    println(people.any(Person::important))
//    println(people.any(::important2))

    val names = listOf("Dog", "Cat")
    println(names.mapIndexed(::Animal))
    println(names.mapIndexed {index, name ->
        Animal(id = index, name = name)
    })
}

fun Person.important() = this.name.startsWith(prefix = "M") && this.age > 20

fun important2(person: Person) = person.name.startsWith(prefix = "M") && person.age > 20

data class Person(
    val name: String,
    val age: Int,
    val male: Boolean
)

data class Animal(
    val id: Int,
    val name: String,
)