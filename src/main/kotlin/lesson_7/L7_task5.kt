package org.example.lesson_7

const val MIN_PASSWORD_SIZE = 6
const val NUMBER_OF_OCCUPIED_CELLS = 3

fun main() {

    print("Введите длину пароля (не менее $MIN_PASSWORD_SIZE символов): ")
    var passwordLength = readln().toInt()

    if (passwordLength < MIN_PASSWORD_SIZE) {
        println("Недопустимая длина пароля!")
        return
    }

    val numbers = ('0'..'9')
    val lowercase = ('a'..'z')
    val uppercase = ('A'..'Z')
    val symbolTypes = numbers.toList() + lowercase + uppercase

    val password = mutableListOf<Char>().apply {
        add(numbers.random())
        add(lowercase.random())
        add(uppercase.random())
        passwordLength = passwordLength - NUMBER_OF_OCCUPIED_CELLS
        do {
            add(symbolTypes.random())
            passwordLength--
        } while (passwordLength != 0)
        shuffle()
    }

    println("Сгенерированный пароль: ${password.joinToString("")}")

}