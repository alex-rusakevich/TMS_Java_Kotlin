package lesson13.classwork

/*
* Задача 10: Напишите расширение для типа Int, которое возвращает true, если
число четное, и false, если нечетное.
* */

val Int.isEven: Boolean
    get() = this % 2 == 0

fun main(){
    println(12.isEven)
    println(11.isEven)
}
