package basics

fun main() {
//    ageRestriction(age = 18)
    val result = checkNumberSign(number = 1)
    println(result)
}

fun ageRestriction(age: Int) {
    if (age < 18) println("Access Denied!")
    if (age > 18 && age == 18) println("Access Approved!")
    if (age > 18 || age == 18) println("Access Approved!")
    if (age >= 18) println("Access Approved!")
}

fun checkNumberSign(number: Int): String {
    return if (number > 0) {
//        return "positive"
        "positive"
    } else if (number < 0) {
//        return "negative"
        "negative"
    } else {
        "zero"
    }
}