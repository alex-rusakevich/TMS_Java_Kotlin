package lesson13.classwork

/*
* Задача 6: Используя sequenceOf, создайте последовательность, содержащую
квадратные числа от 1 до 5.
* */

fun squareNumbers(): Array<Int> {
    return (1..5).map { it * it }.toTypedArray()
}

fun main() {
    println(squareNumbers().contentToString())
}