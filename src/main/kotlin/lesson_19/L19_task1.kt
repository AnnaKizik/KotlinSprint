package org.example.lesson_19

enum class Fish(val rusName: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок"),
}

fun main() {
    println("Вы можете добавить следующих рыб:")
    Fish.entries.forEach { fish ->
        println(fish.rusName)
    }
}