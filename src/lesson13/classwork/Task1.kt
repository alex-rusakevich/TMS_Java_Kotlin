package lesson13.classwork

data class Person(var name: String = "")

fun main() {
    val p = Person().apply { name = "Mitchell" }

    p.let {
        println(it.name)
    }
}