package org.example.lesson_8

fun main() {

    val ingredientsList = arrayOf("яйцо", "молоко", "мука", "масло", "корица", "соль", "сахар")
    print("Какой ингредиент найти? - ")
    val userIngredient = readln()

    for (i in ingredientsList) {
        if (i == userIngredient) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")

}