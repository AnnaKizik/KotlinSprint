package org.example.lesson_16

class UserInfo(
    private val login: String = "Jack",
    private val password: String = "1234"
) {
    fun checkPassword() = println(password == readln())
}

fun main() {
    val user = UserInfo()

    print("Введите пароль: ")
    user.checkPassword()
}