package org.example.lesson_4

fun main() {

    var cargoWeight = 20
    val maxWeight = 100
    val minWeight = 35
    var cargoVolume = 80
    val maxVolume = 100
    val averageParameters = cargoWeight > minWeight && cargoWeight <= maxWeight && cargoVolume < maxVolume

    println("Груз весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $averageParameters")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $averageParameters")

}