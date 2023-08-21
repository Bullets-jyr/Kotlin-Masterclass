package IntroductingWithObjects

fun main() {
    val animals = mapOf(
        "Monkey" to "brown",
        "Tiger" to "orange",
        "Whale" to "blue",
    )

    println(animals.get("Monkey"))
    println(animals["Monkey"])
    println(animals["Dog"])

    val keys = animals.keys
    val values = animals.values
    println(keys)
    println(values)

    for (entry in animals) {
        println(entry.key)
        println(entry.value)
    }

    for ((key, value ) in animals) {
        println(key)
        println(value)
    }

    animals.forEach { key, value ->

    }

    println(animals.getOrDefault(key = "Monkey", defaultValue = "Black"))
    println(animals.getOrDefault(key = "Dog", defaultValue = "Black"))

    val filteredMap = animals.filter {
        it.value.length > 4
    }
    println(filteredMap)

//    val animalList = listOf("Monkey", "Tiger", "Whale")
//    println(animalList.associateBy { it })

    val monkey = Animal(name = "Monkey", age = 2)
    val tiger = Animal(name = "Tiger", age = 4)
    val whale = Animal(name = "Whale", age = 6)

    val animalList = listOf(monkey, tiger, whale)
    val animalMap = animalList.associateBy({ it.name }, { it.age })
    println(animalMap)
}

class Animal(
    val name: String,
    val age: Int
)