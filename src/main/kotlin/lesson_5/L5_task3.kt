package org.example.lesson_5

fun main() {

    val winNumber1 = (0..42).random()
    val winNumber2 = (0..42).random()

    print("Введите любое целое число от 0 до 42: ")
    val userNumber2 = readln().toInt()

    print("Введите еще одно целое число от 0 до 42: ")
    val userNumber1 = readln().toInt()

    val result = when {
        (userNumber1 == winNumber1 || userNumber1 == winNumber2) && (userNumber2 == winNumber1 || userNumber2 == winNumber2)
            -> "Поздравляем! Вы выиграли главный приз!"

        (userNumber1 == winNumber1 || userNumber1 == winNumber2) || (userNumber2 == winNumber1 || userNumber2 == winNumber2)
            -> "Вы выиграли утешительный приз!"

        else -> "Неудача!"
    }

    println(result)

    println("Выигрышные числа: $winNumber1 и $winNumber2")

}