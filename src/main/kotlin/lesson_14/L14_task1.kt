package org.example.lesson_13

open class Liner(
    val numberOfPassengers: Int = 5000,
    val speed: Double = 50.3,
)

class Cargo(
    val loadCapacity: Int
): Liner(numberOfPassengers = 10, speed = 22.6)

class Icebreaker(
    val breakIce: Boolean
): Liner(numberOfPassengers = 60, speed = 20.2)

fun main(){

    val liner = Liner()

    val cargo = Cargo(8000)

    val icebreaker = Icebreaker(true)

}

