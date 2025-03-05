package lesson13.classwork

/*
* Задача 9: Напишите расширение для List<Int>, которое возвращает среднее
значение.
* */

val List<Int>.avg: Int
    get(){
        return this.reduce(
            { acc: Int, i: Int ->
                acc + i
            }
        ) / this.size
    }

fun main() {
    val l: List<Int> = listOf(
        1, 2, 3
    )
    println(l.avg)
}
