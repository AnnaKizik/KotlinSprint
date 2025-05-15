package org.example.lesson_7

fun main() {

    var password = ""
    val lettersForPassword = 'a'..'z'
    val numbersForPassword = 0..9

    for (i in 1..6) {
        if (i % 2 == 1)
            password += lettersForPassword.random()
        else
            password += numbersForPassword.random()
    }

    println("Сгенерированный пароль: $password")

}