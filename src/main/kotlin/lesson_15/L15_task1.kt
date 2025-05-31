package org.example.lesson_15

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Crucian : Swimmable {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull : Swimmable, Flyable {
    override fun swim() {
        println("Чайка плавает")
    }

    override fun fly() {
        println("Чайка летает")
    }
}

class Duck : Swimmable, Flyable {
    override fun swim() {
        println("Утка плавает")
    }

    override fun fly() {
        println("Утка летает")
    }
}

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swim()
    seagull.swim()
    seagull.fly()
    duck.swim()
    duck.fly()
}