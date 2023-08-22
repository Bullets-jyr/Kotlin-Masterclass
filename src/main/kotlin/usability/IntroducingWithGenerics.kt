package usability

fun main() {
//    val car = Car(tires = Tires(size = 17))
//    val car2 = Car(tires = "17")
//    val car3 = Car(tires = 17)

//    println(car.getValue())
//    println(car2.getValue())
//    println(car3.getValue())

    val vehicle = Vehicle(value = Car())
    val car = vehicle.getValue()
    car.start()

    getName(name = "Bullets")
    getName(name = Vehicle(value = 1))
}

fun <T> getName(name: T): T = name

//class Vehicle(private val value: Any) {
//    fun getValue() = value
//}
class Vehicle<T>(private val value: T) {
    fun getValue(): T = value
}

class Car {
    fun start() = "Starting the engine."
}

//data class Tires(
//    val size: Int
//)
//class Car(private val tires: Tires) {
//    fun getValue() = tires
//}

//data class Tires(
//    val size: Int
//)
//class Car<T>(private val tires: T) {
//    fun getValue(): T = tires
//}
