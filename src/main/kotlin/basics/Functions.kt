package basics

fun main() {
    helloWorld()
    helloWorld()
    helloWorld()
    val result1 = sumOfTwoNumbers()
//    val result = sumOfTwoNumbers(3, 7)
    val result = sumOfTwoNumbers2(3, 7)
    println(result)
}

fun helloWorld() {

}

fun sumOfTwoNumbers() {
    println(2 + 2)
}

//fun sumOfTwoNumbers(a: Int, b: Int): Unit {
fun sumOfTwoNumbers(a: Int, b: Int): Int {
//    println(2 + 2)
    return a + b
}

//fun sumOfTwoNumbers2(a: Int, b: Int): Int =  a + b
fun sumOfTwoNumbers2(a: Int, b: Int) =  a + b
