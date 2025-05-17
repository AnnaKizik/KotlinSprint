package org.example.lesson_9

fun main() {

    var numberOfIngredients = 5
    val listOfIngredients = mutableSetOf<String>()

    while (numberOfIngredients != 0) {
        print("Введите ингредиент: ")
        listOfIngredients.add(readln())
        numberOfIngredients--
    }

    println(listOfIngredients.sorted().joinToString(", ").replaceFirstChar { it.uppercase() })

}