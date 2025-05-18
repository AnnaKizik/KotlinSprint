package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun userInformation() {

        println(
            """
        Id: $id
        Логин: $login
        Пароль: $password
        Почта: $mail
        О себе: $bio
        """.trimIndent()
        )

    }

    fun fillBio() {

        print("Расскажите о себе: ")
        bio = readln()

    }

    fun changePassword() {

        print("Введите пароль: ")
        if (readln() == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен!")
        } else {
            println("Неверный пароль!")
        }

    }

}

fun main() {

    val user1 = User2(
        45,
        "lena3",
        "1234",
        "lena@mail.ru"
    )

    user1.fillBio()
    user1.changePassword()
    user1.userInformation()

}