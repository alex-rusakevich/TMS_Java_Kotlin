package lesson13.classwork

/*
* Задача 8: Создайте расширение для типа String, которое возвращает
количество гласных в строке.
* */

val String.vowels: Int
    get() = this.filter { "aeiouy".contains(it) }.length

fun main() {
    println("Hello".vowels)
}