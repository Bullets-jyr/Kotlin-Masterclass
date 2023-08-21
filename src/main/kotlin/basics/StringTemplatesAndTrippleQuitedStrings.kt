package basics

fun main() {
//    val number = 10
//    val favoriteNumber = "My favorite is: ${number.toFloat()}"
//    println(favoriteNumber)
    val about = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n" +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n" +
            "when an unknown printer took a galley of type and scrambled it to make a type specimen book."
    println(about)
    val about1 = """Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
        |Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
        #when an unknown printer took a galley of type and scrambled it to make a type specimen book.""".trimMargin(marginPrefix = "#")
    println(about1)
}

//fun setAge(age: Int) {
//    println("${if (age < 18) "Minor" else "Adult"}")
//}