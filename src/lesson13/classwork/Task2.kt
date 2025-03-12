package lesson13.classwork

/*
* Задача 2: Напишите код, который создает объект класса Book и выводит
информацию о нем, используя run.
* */

data class Book(var name: String, var author: String)

fun main() {
    Book("The Book About Books", "A. Boba").run {
        println(name)
        println(author)
    }
}