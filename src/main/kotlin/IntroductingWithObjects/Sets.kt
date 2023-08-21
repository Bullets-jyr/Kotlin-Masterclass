package IntroductingWithObjects

fun main() {
    val mySet = setOf<Int>(1, 2, 2, 3, 3, 4, 6, 4)
    val mySet2 = mutableSetOf<Int>(1, 2, 2, 3, 3, 4, 6, 4)

    println(mySet)
    println(mySet.contains(element = 2))
    println(2 in mySet)
    println(mySet.containsAll(elements = setOf(1, 3, 6)))
    println(mySet.containsAll(elements = setOf(1, 3, 5)))

    println(mySet subtract setOf(6, 11))
    println(mySet intersect  setOf(6, 11))
    println(mySet union   setOf(6, 11))

    val myList = listOf<Int>(1, 2, 2, 3, 3, 4, 6, 4)
    println(myList)
    println(myList.toSet())
    println(myList.distinct())
}