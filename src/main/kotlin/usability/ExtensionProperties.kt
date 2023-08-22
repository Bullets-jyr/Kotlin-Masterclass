package usability

fun main() {
    val name = "Bullets"
    println(name.longOrShort)
    println(name.quoted())

    val numbers = listOf(1, 2, 3, 4, 5)
    val numbers2 = listOf<Int>()
    println(numbers.getFirstOrNull)
    println(numbers2.getFirstOrNull)
}

val String.longOrShort: String
    get() = if (length > 10) "Long" else "Short"

fun String.quoted() = "\"$this\""

val <T> List<T>.getFirstOrNull: T?
    get() = if (isEmpty()) null else first()