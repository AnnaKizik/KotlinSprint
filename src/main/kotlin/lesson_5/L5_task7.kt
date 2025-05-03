package org.example.lesson_5

const val LENGHT_UNIT = 100

fun main() {

    print("Расстояние поездки (км): ")
    val travelDistance = readln().toDouble()

    print("Расход топлива на 100км (л): ")
    val fuelConsumption = readln().toDouble()

    print("Текущая цена за литр топлива: ")
    val pricePerLiter = readln().toDouble()

    val fuelAmount = (travelDistance * fuelConsumption) / LENGHT_UNIT
    val fuelPrice = fuelAmount * pricePerLiter

    println("Общее количество топлива: $fuelAmount л")
    println("Стоимость поездки: %.2f".format(fuelPrice))

}