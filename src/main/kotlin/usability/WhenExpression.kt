package usability.whenexpression

import kotlin.random.Random

fun main() {
//    when (Random.nextInt(from = 1, until = 5)) {
//        1 -> {
//            println("One")
//        }
//        2 -> {
//            println("Two")
//        }
//        3 -> {
//            println("Three")
//        }
//    }
    val result = when (Random.nextInt(from = 1, until = 5)) {
        1 -> {
            1
        }
        2 -> {
            2
        }
        3 -> {
            3
        }
        else -> {
            null
        }
    }
    println(result)

    when (getPerson()) {
        is Person.Male -> {
            println("Male")
        }
        is Person.Female -> {
            println("Female")
        }
    }

    val number = listOf(1, 2, 3, 4, 5)
    for (n in number) {
        when (n) {
            1 -> {
                break
            }
            2 -> {
                continue
            }
            3 -> {
                println("Three")
            }
            4 -> {
                println("Four")
            }
            5 -> {
                println("Five")
            }
        }
    }
}

fun getPerson(): Person {
    return if (Random.nextInt(from = 1, until = 3) == 1) Person.Male else Person.Female
}

sealed class Person {
    object Male: Person()
    object Female: Person()
}

