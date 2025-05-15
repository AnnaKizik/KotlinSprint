package org.example.lesson_9

fun main() {

    val listOfIngredients = listOf("вода", "курица", "картофель", "морковь", "фасоль", "перец", "соль")

    println("В рецепте есть следующие ингредиенты:")

    listOfIngredients.forEach {
        println(it)
    }

}