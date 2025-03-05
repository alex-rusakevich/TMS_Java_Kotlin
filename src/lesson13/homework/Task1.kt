package lesson13.homework

/*
Задача 1: Напишите функцию, которая принимает список целых чисел и
возвращает их сумму. Используйте лямбду в качестве параметра для
определения операции. (Reduce)
*/

fun getSum(numbers: Array<Int>): Int {
    return numbers.reduce { acc, value: Int -> acc + value }
}

fun main(){
    val arr = arrayOf(1, 2, 3, 4, 5)
    println(getSum(arr))
}