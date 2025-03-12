package lesson13.classwork

/*
* Задача 7: Создайте функцию inline, которая принимает два числа и выполняет
операцию сложения через лямбду.
* */

inline fun sum(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val result = sum(6, 4) {
        x, y -> x + y
    }

    println(result)
}