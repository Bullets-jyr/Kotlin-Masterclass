package basics

fun main() {
    var number = 0
//    while (number <= 10) {
    while (condition(number = number)) {
        println(number)
//        number++
        number += 10
    }

    do {
        println(number)
        number += 10
    } while (condition(number = number))

    displayContent(text = "Bullets-jyr")
}

//fun condition(number: Int): Boolean {
//    return number <= 10
//}

fun condition(number: Int) = number <= 100

fun displayContent(text: String) {
    var i = 0
    while (i < text.length) {
        println(text[i])
        i++
    }
}
