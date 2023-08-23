package usability

fun main() {
    val priority = Priority.LOW
    println(priority)
    println(priority.name)
    println(priority.color)
    println(priority.number)
//    println(priority)
//    println(priority.color)

    val priority2 = Priority.valueOf(value = "LOW")
    println(priority2)

    for (pri in Priority.values()) {
        println(pri.color)
    }
}

//enum class Priority {
//    LOW, MEDIUM, HIGH
//}

enum class Priority(val color: String) {
    LOW(color = "Green"),
    MEDIUM(color = "Orange"),
    HIGH(color = "Red");

    val number: Int
        get() = when (this) {
            LOW -> 1
            MEDIUM -> 2
            HIGH -> 3
        }
}
