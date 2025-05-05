package org.example.lesson_5

fun main() {

    print("Имя пользователя: ")
    val userName = readln()
    val registeredName = "Zaphod"

    if (userName != registeredName)
        println("Новый пользователь. Необходима регистрация")
    else {
        print("Введите пароль: ")
        val userPassword = readln()
        val registeredPassword = "PanGalactic"

        if (userPassword == registeredPassword)
            println("Добро пожаловать, $userName!")

    }

}