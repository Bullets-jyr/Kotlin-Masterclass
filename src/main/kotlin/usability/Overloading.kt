package usability.overloading

fun main() {

}

fun person(name: String) {}
fun person(name: Char) {}

class Person {
    fun getName(name: String) = name
}

fun Person.getName2(name: String) = name

//fun person(name: String) {}
//fun person(name: String, age: Int) {}

//fun person(name: String): String {
//    return name
//}
//fun person(name: String): Int {
//    return name.toInt()
//}
