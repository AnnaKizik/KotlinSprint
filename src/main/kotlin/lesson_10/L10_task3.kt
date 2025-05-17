package org.example.lesson_10

fun main() {

    println(passwordGenerator())

}

fun passwordGenerator(): String {
    print("Введите длину пароля: ")
    val passwordSize = readln().toInt()

    val minNumber = 0
    val maxNumber = 9
    val passwordNumbers = (minNumber..maxNumber)
    val passwordSymbols =
        arrayOf("!", "\"", "#", "$", "%", "&", "'", "(", ")", ",", "*", "+", "-", ".", "/", " ")
    val generatedPassword = mutableListOf<String>()


    for (i in 0 until passwordSize) {
        if (i % 2 == 1)
            generatedPassword.add(passwordSymbols.random())
        else
            generatedPassword.add(passwordNumbers.random().toString())
    }

    return (generatedPassword.joinToString(""))

}