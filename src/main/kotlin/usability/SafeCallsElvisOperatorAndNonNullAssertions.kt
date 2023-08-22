package usability

fun main() {
    getName(name = "Bullets")
    getName(name = null)
}

//fun getName(name: String?) {
//    if (name != null) {
//        println(name.length)
//    }
//    println(name!!.length)
//    println(name?.length ?: 0)
//}

fun getName(name: String?) {
    println(name.isNullOrEmpty())
}

