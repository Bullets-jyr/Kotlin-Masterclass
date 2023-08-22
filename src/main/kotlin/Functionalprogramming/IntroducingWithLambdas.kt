package Functionalprogramming

import kotlin.random.Random

fun main() {
    val numbers = listOf(1, 2, 3)
    val quotedNumbers = numbers.map { number ->
        "\"$number\""
    }
    println(numbers)
    println(quotedNumbers)

    val quotedNumbers2 = numbers.joinToString { number ->
        "\"$number\""
    }
    println(quotedNumbers2)

    val quoted = { number: Int -> "\"$number\"" }
    val quotedNumbers3 = numbers.joinToString(transform = quoted)

    val quotedNumbers4 = numbers.mapIndexed { _, number ->
        "$number"
    }

    button(onClick =  {
        println("Clicked")
    })
    button {
        println("Clicked")
    }

    button2 { random ->
        "$random"
    }
}

fun button(onClick: () -> Unit) {
    onClick()
}

fun button2(onClick: (Int) -> String) {
    onClick(Random.nextInt(from = 1, until = 100))
}
