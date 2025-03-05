package lesson13.homework

/*
Задача 2: Напишите программу, которая получает список людей, фильтрует
только тех, кто старше 18 лет, затем сортирует их по возрасту в порядке
убывания и выводит на экран с помощью apply и let. (sortedByDescending)
*/

data class Person(var name: String = "Unknown", var age: Int = 0);

fun main() {
    var people = listOf(
        Person().apply {
            name = "John"
            age = 17
        },
        Person().apply {
            name = "Moe"
            age = 34
        },
        Person().apply {
            name = "Ziliboba"
            age = 20
        }
    )

    people = people.let {
        it.filter { p: Person -> p.age > 18 }
            .sortedByDescending { p: Person -> p.name }
    }

    println(people)
}