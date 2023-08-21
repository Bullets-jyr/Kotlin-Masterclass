package basics

fun main() {
//    val elements = listOf<String>("A", "B")
//    for (e in elements) {
//        println("Current element: $e")
//    }

    val number = 40
    println(number in 0..100)

    println('t' in "Kotlin")
    println('T' in "Kotlin")

    println(isDigit(ch = 'a'))
    println(isDigit(ch = '2'))

    println(isNotDigit(ch = 'a'))

    println(isLowerCase(ch = 'a'))
    println(isLowerCase(ch = 'A'))

    println(isUpperCase(ch = 'a'))
    println(isUpperCase(ch = 'A'))
}

fun isDigit(ch: Char) = ch in '0'..'9'
fun isNotDigit(ch: Char) = ch !in '0'..'9'

fun isLowerCase(ch: Char) = ch in 'a'..'z'
fun isUpperCase(ch: Char) = ch in 'A'..'Z'