package IntroductingWithObjects

import kotlin.random.Random

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 2)
    val numbers2 = mutableListOf<Int>()

    var myList = listOf<Int>(1, 2, 3)
    println(myList)
    myList += 4
    println(myList)

    val result = createList()
    println(result)

    println(numbers2)
    numbers2.addAll(listOf(1, 2, 3, 4, 5))
    println(numbers2)

    numbers2.add(element = 6)
    println(numbers2)

    numbers2.remove(element = 3)
    println(numbers2)

    numbers2.add(index = 0, element = 101)
    println(numbers2)

    numbers2.clear()
    println(numbers2)

//    println(numbers)
//    println(numbers[0])
//    println(numbers.first())
//    println(numbers.last())
//    println(numbers.take(n = 3))

//    println(countOccurrences(list = numbers, number = 2))
}

fun createList(): List<Int> {
    val numbers = mutableListOf<Int>()
    for (number in 0 until 10) {
        numbers.add(element = Random.nextInt(from = 1, until = 100))
    }
    return numbers
}

fun countOccurrences(list: List<Int>, number: Int): Int {
    var occurrences = 0
    for (e in list) {
        if (number == e) {
            occurrences++
        }
    }
    return occurrences
}