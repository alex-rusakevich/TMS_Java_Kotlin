package lesson13.homework

/*
* Задача 3: Создайте список чисел от 1 до 1,000,000, отфильтруйте четные числа,
затем возведите их в квадрат и посчитайте сумму всех этих чисел. Сделайте это с
использованием asSequence для ленивой обработки.
* */

fun processNumbers(numFrom: Int, numTo : Int): Int {
    return (numFrom..numTo).asSequence()
        .filterNot { it % 2 == 0 }
        .map { it: Int -> it * it }
        .reduce { acc: Int, i: Int -> acc + i }
        .toInt();
}

fun main() {
    println(processNumbers(1, 1_000_000))
}