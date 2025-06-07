package org.example.lesson_16

class UserInfo(
    private val login: String,
    private val password: String
) {
    fun checkPassword(inputPassword: String) = password == inputPassword
}

fun main() {
    val user = UserInfo("Jack", "1234")

    print("Введите пароль: ")
    println(user.checkPassword(readln()))
}