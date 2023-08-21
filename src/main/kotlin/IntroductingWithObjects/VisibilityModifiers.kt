package IntroductingWithObjects.visibilitymodifiers

fun main() {
    val person = Person(name = "jyr")
//    person.nickname
    person.getTheName()
}

private class Person(private val name: String) {
    private val nickname = "Bullets-jyr"

    fun getTheName() {
        println("Public: $name")
    }

    private fun getTheNickName() {
        println(nickname)
    }
}
