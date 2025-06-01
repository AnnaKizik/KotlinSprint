package org.example.lesson_13

open class Liner(
    val name: String,
    val numberOfPassengers: Int = 5000,
    val speed: Double = 50.3,
    val loadCapacity: Int = 5000
)

class Cargo(
    name: String,
) : Liner(name = name, numberOfPassengers = 10, speed = 22.6, loadCapacity = 8000)

class Icebreaker(
    name: String,
    val breakIce: Boolean
) : Liner(name = name, numberOfPassengers = 60, speed = 20.2, loadCapacity = 500)

fun main() {

    val liner = Liner("Evergreen")

    val cargo = Cargo("Lucky")

    val icebreaker = Icebreaker("Believer", true)

}

