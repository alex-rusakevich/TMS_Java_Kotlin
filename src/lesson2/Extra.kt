package lesson2

fun filterEmptyAndCutTo10(strings: List<String?>): List<String> {
    val resultingStrings = mutableListOf<String>()

    for (str in strings) {
        if (str == null) continue
        if (str.trim() == "") continue

        if (str.length > 10)
            resultingStrings.add(str.slice(0..<10))
        else
            resultingStrings.add(str)
    }

    return resultingStrings.toList()
}

fun fizzBuzzer() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0)
            print("FizzBuzz")
        else if (i % 3 == 0)
            print("Fizz")
        else if (i % 5 == 0)
            print("Buzz")
        else
            print(i)

        print(" ")
    }
}

fun checkNumberOrStr(value: Any) {
    when {
        value is Int && value > 0 -> println("Число положительное")
        value is Int && value < 0 -> println("Число отрицательное")
        value is String && value.length > 5 -> println("Это строка")
        else -> println("Неизвестный тип")
    }
}

fun main() {
    println(
        filterEmptyAndCutTo10(
            listOf("Hii", null, "1234567890987654321", "   ", "Hello")
        )
    )

    fizzBuzzer()
    println()

    checkNumberOrStr("Hellooo")
}
