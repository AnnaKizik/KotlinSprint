package org.example.lesson_6

fun main() {

    val lowLimit = 1
    val upLimit = 9
    var attempts = 3
    var userAnswer: Int

    do {
        val number1 = (lowLimit..upLimit).random()
        val number2 = (lowLimit..upLimit).random()
        print("Выполните сложение: $number1 + $number2 = ")
        userAnswer = readln().toInt()
        if (userAnswer == number1 + number2) {
            println("Добро пожаловать!")
            break
        } else
            attempts--
        println("Неверно! Осталось попыток: $attempts")
    } while (attempts > 0)

    if (attempts == 0) println("Доступ запрещен")

}