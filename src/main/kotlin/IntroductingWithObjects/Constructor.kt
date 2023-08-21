package IntroductingWithObjects.constructor

fun main() {
    val person = Person(name = "Bullets-jyr")
//    val person = Person()
    person.name
    person.getName()
//    person.myName
    println(person.toString())
}

//class Person(name: String) {
//    val myName = name
//
//    fun getName() {
////        println(name)
//        println(myName)
//    }
//}

class Person(val name: String = "Unknown") {
    fun getName() {
        println(name)
    }

    override fun toString(): String {
        return name
    }
}