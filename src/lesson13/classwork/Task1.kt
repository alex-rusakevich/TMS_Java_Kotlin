package lesson13.classwork

/*
* Задача 1:Создайте объект класса Person с полем name, используя apply.
Затем выведите имя через let.
* */

data class Person(var name: String = "")

fun main() {
    val p = Person().apply { name = "Mitchell" }

    p.let {
        println(it.name)
    }
}