package basics.defaultandnamedarguments

fun main() {
//    val result = sumOfTwoNumbers(b = 3, a = 7)
    val result = sumOfTwoNumbers(b = 3, a = 15)
    println(result)
}

fun sumOfTwoNumbers(a: Int = 10, b: Int) =  a + b