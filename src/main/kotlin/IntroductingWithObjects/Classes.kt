package IntroductingWithObjects

fun main() {
    val house = House()
    val house2 = House()
    println(house)
    println(house.enterTheHouse())
    println(house2)
}

class House {
    fun enterTheHouse() = "Entering the house..."
}