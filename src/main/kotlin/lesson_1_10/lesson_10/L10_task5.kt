package org.example.lesson_10

const val LOGIN = "Anna"
const val PASSWORD = 12345
const val TOKEN_LENGTH = 32

private val cartItems = "список товаров в корзине"

fun main() {

    val verificationResult = verification()

    if (verificationResult == null) {
        println("Неверный логин или пароль!")
        return
    }

    val savedCart = getCart(token = verificationResult)
    println(savedCart)

}

fun verification(): String? {
    print("Введите логин: ")
    val enteredLogin = readln()

    print("Введите пароль: ")
    val enteredPassword = readln().toInt()

    if (enteredLogin == LOGIN && enteredPassword == PASSWORD)
        return tokenGeneration()
    else
        return null
}

fun tokenGeneration(): String? {
    var token = ""

    for (i in 1..TOKEN_LENGTH) {
        token += (('0'..'9') + ('a'..'z') + ('A'..'Z')).random().toString()
    }
    return (token)
}

fun getCart(token: String): String? {

    if (token.length == TOKEN_LENGTH)
        return cartItems
    else return null
}