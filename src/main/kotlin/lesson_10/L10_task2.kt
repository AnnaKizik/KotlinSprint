package org.example.lesson_10

fun main() {

    print("Придумайте логин: ")
    val userLogin = readln()

    print("Придумайте пароль: ")
    val userPassword = readln()

    lengthCheck(userLogin, userPassword)
}

fun lengthCheck(login: String, password: String) {
    if (login.length < 4 || password.length < 4)
        println("Логин или пароль недостаточно длинные")
}
