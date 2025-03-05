package lesson13.classwork

data class Book(var name: String, var author: String)

fun main() {
    Book("The Book About Books", "A. Boba").run {
        println(name)
        println(author)
    }
}