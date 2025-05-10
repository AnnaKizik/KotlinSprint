package org.example.lesson_8

fun main() {

    val ingredientsList = arrayOf("яйцо", "молоко", "мука", "масло", "корица", "соль", "сахар")
    println("Ингредиенты: ${ingredientsList.joinToString(", ")}")

    print("Какой ингредиент заменить? - ")
    val replaceIngredient = readln()
    val inListOrNot = ingredientsList.indexOf(replaceIngredient)
    if (inListOrNot >= 0) {
        print("Какой игредиент добавить? - ")
        val newIngredient = readln()
        ingredientsList[inListOrNot] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredientsList.joinToString(", ")}")
    } else
        println("Такого ингредиента в списке нет")

}