package org.example.lesson_19

enum class Cartridges(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank(
    private var cartridgesType: Cartridges? = null
) {
    fun changeCartridgesType(newType: Cartridges) {
        cartridgesType = newType
        println("Тип патронов изменен")
    }

    fun shoot() {
        println("Произведен выстрел. Нанесено ${cartridgesType?.damage} единиц урона")
    }
}

fun main() {
    val tank = Tank()

    tank.changeCartridgesType(Cartridges.BLUE)
    tank.shoot()
    tank.changeCartridgesType(Cartridges.GREEN)
    tank.shoot()
    tank.changeCartridgesType(Cartridges.RED)
    tank.shoot()
}