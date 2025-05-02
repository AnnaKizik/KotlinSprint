package org.example.lesson_5

fun main() {

    val number1 = 3
    val number2 = 5

    println("Выполните сложение: $number1 + $number2 = ?")
    print("Ваш ответ: ")
    val userAnswer = readln().toInt()

    if (userAnswer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}