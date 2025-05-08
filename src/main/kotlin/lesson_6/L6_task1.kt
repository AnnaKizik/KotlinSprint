package org.example.lesson_6

fun main() {

    print("Придумайте логин: ")
    val userLogin = readln()

    print("Придумайте пароль: ")
    val userPassword = readln()

    do {
        print("Введите логин: ")
        val enteredLogin = readln()

        print("Введите пароль: ")
        val enteredPassword = readln()

    } while (enteredLogin != userLogin || enteredPassword != userPassword)

    println("Авторизация прошла успешно")

}