package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {}

fun main() {

    val user1 = User(
        10,
        "boris123",
        "138907",
        "b.smirnov@mail.ru"
    )

    val user2 = User(
        34,
        "nika1",
        "12345",
        "veronika.f@mail.ru"
    )

    println(
        """
        Id: ${user1.id}
        Логин: ${user1.login}
        Пароль: ${user1.password}
        Почта: ${user1.mail}
    """.trimIndent()
    )

    println(
        """
            
        Id: ${user2.id}
        Логин: ${user2.login}
        Пароль: ${user2.password}
        Почта: ${user2.mail}
    """.trimIndent()
    )

}