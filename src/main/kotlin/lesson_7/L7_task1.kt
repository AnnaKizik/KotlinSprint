package org.example.lesson_7

fun main() {

    var password = " "

    for (i in 1..6) {
        if (i % 2 == 1) {
            val letterForPassword = ('a'..'z').random()
            password += letterForPassword
        } else {
            val numberForPassword = (0..9).random()
            password += numberForPassword
        }
    }

    println("Сгенерированный пароль: $password")

}