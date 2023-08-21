package basics

fun main() {
    // For is not an expression, and only expressions are allowed here
//    val result = for (i in 1..10) {}
    for (i in 1..10) {

    }

    val result = unitFun()

    var number = 10
    number = 100
}

class Example {}

fun bigger(a: Int, b: Int) = if (a > b) a else b

fun unitFun() = Unit
fun unitFun2() {}