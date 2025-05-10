package org.example.lesson_8

fun main() {

    val ingredientsList = arrayOf("яйцо", "молоко", "мука", "масло", "корица", "соль", "сахар")
    print("Какой ингредиент найти? - ")
    val userIngredient = readln()
    var presentIngredient = ""

    for (i in ingredientsList) {
        if (userIngredient == i) presentIngredient += i
    }

    if (presentIngredient.isNotBlank())
        println("Ингредиент $presentIngredient в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")

}