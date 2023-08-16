package objectorientedprogramming.sealedclasses

fun main() {

}

//open class Vehicle
sealed class Vehicle

data class Car(
    val manufacturer: String,
    val model: String
): Vehicle()

data class Bicycle(
    val manufacturer: String
): Vehicle()

data class Atv(
    val manufacturer: String
): Vehicle()

fun getVehicle(vehicle: Vehicle) =
    when (vehicle) {
        is Car -> "${vehicle.manufacturer} - ${vehicle.model}"
        is Bicycle -> vehicle.manufacturer
        is Atv -> TODO()
//        else -> "Unknown Vehicle!"
    }

sealed class Animal {
    abstract val isMale: Boolean
    val legs: Int = 4
    abstract fun speak(): String
    fun eat() = "Eating"
}