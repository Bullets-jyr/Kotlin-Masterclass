package basics

fun main() {
    val elements = listOf<String>("A", "B")
    for (e in elements) {
        println("Current element: $e")
    }

    for (number in 1..3) {
        println("Current number: $number")
    }

    val range1 = 1..10
    val range2 = 0 until 10
    println(range1)
    println(range2)

    showRange(range = 1..3)
    showRange(range = 3 downTo 1)
    showRange(range = 0..10 step 2)
    showRange(range = 9 downTo 0 step 3)

    for (letter in 'a'..'z') {
        println("Current letter: $letter")
    }

    val character: Char = 'a'
    println(character + 25)

    for (character in "Jnskhm ") {
        print(character + 1)
    }

    repeat(times = 3) {
        println("Kotlin is the best!")
    }
}

fun showRange(range: IntProgression) {
    for (number in range) {
        print("Current number: $number")
    }
    print(" // $range")
    println()
}