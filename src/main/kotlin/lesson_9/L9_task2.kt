package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("вода", "соль", "курица")

    println("В рецепте есть базовые ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }

    print("Желаете добавить еще? – ")
    if (readln().equals("да")) {
        print("Какой ингредиент вы хотите добавить? – ")
        val userIngredient = readln()
        listOfIngredients.add(userIngredient)

        println("Теперь в рецепте есть следующие ингредиенты:")
        listOfIngredients.forEach {
            println(it)
        }
    }
}