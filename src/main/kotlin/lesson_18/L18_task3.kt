package org.example.lesson_18

abstract class Animal(private val name: String) {
    abstract fun feedAnimal()
}

class Fox(
    private val name: String
) : Animal(name) {
    override fun feedAnimal() {
        println("$name ест ягоды")
    }
}

class Dog(
    private val name: String
) : Animal(name) {
    override fun feedAnimal() {
        println("$name ест кости")
    }
}

class Cat(
    private val name: String
) : Animal(name) {
    override fun feedAnimal() {
        println("$name ест рыбу")
    }
}

fun main() {

    val listOfAnimals: List<Animal> = listOf(Fox("foxy"), Dog("doggy"), Cat("kitty"))

    listOfAnimals.forEach { animal ->
        animal.feedAnimal()
    }
}