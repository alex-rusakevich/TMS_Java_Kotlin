package lesson13.classwork

/*
* Задача 5: Используя asSequence, выполните последовательную фильтрацию и
возведение в квадрат для списка четных чисел, но только после того как вы
преобразуете его в Sequence.
* */

fun main() {
    println(
        listOf(1, 2, 3, 4, 5).asSequence()
            .filter { it % 2 == 0 }
            .map { it * it }
            .toList()
    )
}