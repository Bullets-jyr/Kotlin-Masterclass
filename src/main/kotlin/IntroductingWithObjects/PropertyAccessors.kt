package IntroductingWithObjects.propertyaccessors

fun main() {
//    val person = Person(age = 17)
//    println(person.isMinor)
//    println(person.age)
//    println(person.age)

    val person = Person()
    println(person.age)
//    println(person.age = 10)
    person.addAge(newAge = 10)
    println(person.age)
}

class Person {
    var age = 0
        private set

    fun addAge(newAge: Int) {
        age = newAge
    }
}

//class Person(val age: Int) {
//    val isMinor
//        get() = age < 18
//    // fun isMinor() = age < 18
//}

//class Person {
//    val age = 0
//        get() = field
//}

//class Person {
//    private var accesses = 0
//
//    val age: Int
//        get() = ++accesses
//}

//class Person {
//    var age = 0
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
//}
