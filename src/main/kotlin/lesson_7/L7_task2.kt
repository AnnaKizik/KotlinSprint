package org.example.lesson_7

fun main() {

    do {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")
        print("Введите код из СМС: ")
        val userCode = readln().toInt()

    } while (userCode != smsCode)

    println("Добро пожаловать!")

}