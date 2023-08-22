package Functionalprogramming.collectionoperation

fun main() {
//    val list1 = List(size = 10) { it }
//    val list2 = MutableList(size = 10) { it }
//    println(list1)
//    println(list2)

    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbersList.filter { number ->
        number > 5
    })
    println(numbersList.filterIndexed { index, number ->
        index == 0
    })
    println(numbersList.filterNot { number ->
        number == 1
    })

    val numbersList2 = listOf(1, null, null, 4, 5, 6, 7, 8, 9, 10)
    println(numbersList2.filterNotNull())

    val numbersList3 = listOf(1, 3, 3, 3, 5, 6, 7, 8, 9, 10)
    println(numbersList3.count { number ->
        number == 3
    })
    println(numbersList3.count())

    println(numbersList.find { number ->
        number == 11
    })
    println(numbersList.find { number ->
        number == 5
    })
    println(numbersList.firstOrNull())
    println(numbersList.lastOrNull())

    println(numbersList.any { number ->
        number == 1
    })

    println(numbersList.all { number ->
        number > 1
    })

    println(numbersList.none { number ->
        number > 10
    })

    val (match, noMatch) = numbersList.partition { number ->
        number < 6
    }
    println(match)
    println(noMatch)

    val randomNumbers = listOf(2, 3, 1, 5, 4, 8, 6, 7, 9, 10)
    println(randomNumbers.sum())
    println(randomNumbers)
    println(randomNumbers.sorted())
    println(randomNumbers.sortedDescending())

    val personList = listOf(
        Person(name = "Bullets", age = 33),
        Person(name = "Marry", age = 25),
        Person(name = "Marlon", age = 45)
    )
    println(personList.sumOf { person ->
        person.age
    })
    println(personList.sortedBy { person ->
        person.age
    })

    println(numbersList.take(n = 4))
    println(numbersList.drop(n = 4))
}

data class Person(
    val name: String,
    val age: Int
)