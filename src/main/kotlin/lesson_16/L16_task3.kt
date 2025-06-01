package org.example.lesson_16

class UserInfo(
    val login: String = "Jack",
    private val password: String = "1234"
) {
    fun checkPassword() {
        print("Введите пароль: ")
        println(password == readln())
    }
}

fun main() {
    val user = UserInfo()
    user.checkPassword()
}