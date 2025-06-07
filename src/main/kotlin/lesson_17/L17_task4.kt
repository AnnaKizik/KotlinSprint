package org.example.lesson_17

class Package(
    private val packageNumber: Int,
    currentLocation: String,
    var moveCount: Int = 0
) {
    var currentLocation: String = currentLocation
        set(value) {
            field = value
            moveCount++
            println("Посылка $packageNumber прибыла в $currentLocation")
        }
}

fun main() {
    val package1 = Package(23, "Ижевск")
    package1.currentLocation = "Москва"
    package1.currentLocation = "Санкт-Петербург"
    package1.currentLocation = "Калининград"

    println("Количество перемещений: ${package1.moveCount}")
}