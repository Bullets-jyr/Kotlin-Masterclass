package IntroductingWithObjects

fun main() {
    val myArray = intArrayOf(6, 8, 10)

    println(sum(1, 3, 5, 3))
    println(sum(numbers = intArrayOf(1, 3, 5, 3, *myArray)))
}

fun sum(vararg numbers: Int): Int {
    var total = 0
    for (n in numbers) {
        total += n
    }
    return total
}