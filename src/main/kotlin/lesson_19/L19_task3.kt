package org.example.lesson_19

class Spaceship {
    fun start() {
        println("Корабль взлетает")
    }

    fun land() {
        println("Корабль приземляется")
        //TODO требуется информация о дополнительной логике
    }

    fun shoot() {
        TODO("NotImplementedError")
    }
}

fun main() {
    val spaceship = Spaceship()

    spaceship.start()
    spaceship.land()
    spaceship.shoot()
}