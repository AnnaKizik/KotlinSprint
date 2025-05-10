package org.example.lesson_6

fun main() {

    val lowLimit = 1
    val upLimit = 9
    var attempts = 5
    val winNumber = (lowLimit..upLimit).random()
    var userNumber: Int

    do {
        print("Введите число от $lowLimit до $upLimit: ")
        userNumber = readln().toInt()
        if (userNumber == winNumber) {
            println("Это была великолепная игра!")
            break
        } else
            attempts--
        println("Неверно! Осталось попыток: $attempts")
    } while (attempts > 0)

    if (userNumber != winNumber) println("Было загадано число: $winNumber")

}