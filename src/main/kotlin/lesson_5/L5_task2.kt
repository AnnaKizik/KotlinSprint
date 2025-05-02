package org.example.lesson_5

const val MAJORITY_AGE = 18

fun main() {

    print("Введите год рождения: ")
    val userBirthYear = readln().toInt()
    val todayYear = 2025
    val userAge = todayYear - userBirthYear

    if (userAge >= MAJORITY_AGE) {
        println("Показать экран со скрытым контентом")
    }

}