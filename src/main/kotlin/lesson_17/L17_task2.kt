package org.example.lesson_17

class Ship(
    name: String,
    avrSpeed: Int,
    homePort: String
) {
    var shipName = name
        set(value) {
            println("Имя корабля изменить нельзя!")
        }
}

fun main() {
    val ship1 = Ship("Brave", 9, "Azov")
    ship1.shipName = "Happiness"
}