package org.example.lesson_17

class InfoUser(
    private var userLogin: String,
    private val userPassword: String
) {
    private val hidePassword = "*"

    var login: String = userLogin
        set(value) {
            field = value
            println("Логин успешно изменен!")
        }

    var password: String
        set(_) {
            println("Вы не можете изменить пароль")
        }
        get() = hidePassword.repeat(userPassword.length)
}

fun main() {

    val user1 = InfoUser("Anna", "potto4ever")

    user1.password = "newPassword"
    println("Пароль: ${user1.password}")
    user1.login = "Anna1"
    println("Новый логин: ${user1.login}")

}