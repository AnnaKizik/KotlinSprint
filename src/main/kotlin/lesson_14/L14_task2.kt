package org.example.lesson_13

open class Liner1(
    val name: String,
    val numberOfPassengers: Int = 5000,
    val speed: Double = 50.3,
    val loadCapacity: Int = 5000
) {
    open fun load() {
        println("Выдвигается горизонтальный трап со шкафута")
    }

    open fun displayInfo() {
        println(
            """
           Информация о корабле
           Количество пассажиров: $numberOfPassengers
           Скорость: $speed
       """.trimIndent()
        )
    }
}

class Cargo1(name: String) : Liner1(name = name, numberOfPassengers = 10, speed = 22.6, loadCapacity = 10000) {

    override fun load() {
        println("\nПогрузочный кран активирован")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Грузоподъемность: $loadCapacity\n")
    }
}

class Icebreaker1(
    name: String,
    val breakIce: Boolean
) : Liner1(name = name, numberOfPassengers = 60, speed = 20.2, loadCapacity = 500) {
    override fun load() {
        println("Открываются ворота со стороны кормы")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Может идти по льду: $breakIce")
    }
}

fun main() {

    val liner = Liner1("Evergreen")
    liner.load()
    liner.displayInfo()

    val cargo = Cargo1("Lucky")
    cargo.load()
    cargo.displayInfo()

    val icebreaker = Icebreaker1("Believer", true)
    icebreaker.load()
    icebreaker.displayInfo()

}

