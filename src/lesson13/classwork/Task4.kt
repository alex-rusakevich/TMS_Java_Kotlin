package lesson13.classwork

/*
* Задача 4: Используя filter, создайте новый список, содержащий только четные
числа из исходного списка.
* */

fun main() {
    println(
        listOf(1, 2, 3, 4, 5)
            .filter { it % 2 == 0 }
            .toList()
    )
}