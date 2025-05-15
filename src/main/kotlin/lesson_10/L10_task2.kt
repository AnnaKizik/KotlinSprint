package org.example.lesson_10

const val MIN_lOGIN_AND_PASSWORD_LENGTH = 4

fun main() {

    print("Придумайте логин: ")
    val userLogin = readln()

    print("Придумайте пароль: ")
    val userPassword = readln()

    lengthCheck(userLogin, userPassword)
}

fun lengthCheck(login: String, password: String) {
    if (login.length < MIN_lOGIN_AND_PASSWORD_LENGTH || password.length < MIN_lOGIN_AND_PASSWORD_LENGTH)
        println("Логин или пароль недостаточно длинные")
}
