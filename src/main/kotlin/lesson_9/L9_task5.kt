package org.example.lesson_9

fun main() {

    var userIngredient: String
    val listOfIngredients = mutableSetOf<String>()

    while (listOfIngredients.size != 5) {
        print("Введите ингредиент: ")
        userIngredient = readln()
        listOfIngredients.add(userIngredient)
    }

    listOfIngredients.sorted()
    println(listOfIngredients.joinToString(", ").replaceFirstChar { it.uppercase() })

}