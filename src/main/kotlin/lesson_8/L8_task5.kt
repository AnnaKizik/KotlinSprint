package org.example.lesson_8

fun main() {

    print("Сколько ингредиентов будет в списке? – ")
    val arraySize = readln().toInt()

    val listOfIngredients = arrayOfNulls<String>(arraySize)

    for (i in 0 until arraySize) {
        print("Введите ингредиент №${i + 1}: ")
        listOfIngredients[i] = readln()
    }

    println("Ингредиенты: ${listOfIngredients.joinToString(", ")}")

}