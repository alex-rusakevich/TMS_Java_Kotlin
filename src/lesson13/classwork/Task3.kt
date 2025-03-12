package lesson13.classwork

/*
* Задача 3: Используя map, создайте новый список строк, где каждая строка — это
строковое представление квадратов чисел из списка.
* */

fun main() {
    print(
        listOf(1, 2, 3, 4, 5)
            .map { (it * it).toString() }
            .toList()
    )
}