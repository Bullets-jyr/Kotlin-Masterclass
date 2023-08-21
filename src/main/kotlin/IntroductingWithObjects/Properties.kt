package IntroductingWithObjects

fun main() {
//    val person1 = Person()
//    println(person1.personAge)
//    person1.setAge(age = 14)
//    println(person1.personAge)
//
//    val person2 = Person()
//    println(person2.personAge)
//    person2.setAge(age = 24)
//    println(person2.personAge)

    val person1 = Person()
    val person2 = person1

    println(person1.personAge)
    println(person2.personAge)
    person1.setAge(age = 30)
    println(person1.personAge)
    println(person2.personAge)
    println(person1)
    println(person2)
}

class Person {
    var personAge = 0

    fun setAge(age: Int) {
        personAge = age
    }
}