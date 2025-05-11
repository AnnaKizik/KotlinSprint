package org.example.lesson_8

fun main() {

    val ingredientsList = arrayOf("яйцо", "молоко", "мука", "масло", "корица", "соль", "сахар")
    print("Какой ингредиент найти? - ")
    val userIngredient = readln()
    val presentOrNot = ingredientsList.indexOf(userIngredient)

    if (presentOrNot >= 0)
        println("Ингредиент ${ingredientsList[presentOrNot]} в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")

}