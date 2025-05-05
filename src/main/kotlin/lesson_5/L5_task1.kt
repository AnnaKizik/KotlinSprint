package org.example.lesson_5

fun main() {

    val number1 = (0..100).random()
    val number2 = (0..100).random()

    println("Выполните сложение: $number1 + $number2 = ?")
    print("Ваш ответ: ")
    val userAnswer = readln().toInt()

    if (userAnswer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}