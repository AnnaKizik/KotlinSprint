package org.example.lesson_9

fun main() {

    println("Введите 5 ингредиентов через запятую с пробелом: ")
    val listOfIngredients = readln().split(", ")

    val listInAlphabeticalOrder = listOfIngredients.sorted()

    println("Список ваших ингредиентов: ")
    listInAlphabeticalOrder.forEach { ingredient ->
        println(ingredient)
    }

}