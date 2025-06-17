package org.example.lesson_20

fun main() {
    val greetUser: (String) -> String

    greetUser = { username ->
        "С наступающим Новым Годом, $username!"
    }

    val newYearGreeting = greetUser("Anna")

    println(newYearGreeting)
}