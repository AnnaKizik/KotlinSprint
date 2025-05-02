package org.example.lesson_4

fun main() {

    var cargoWeight = 20
    var cargoVolume = 80
    val averageParameters = cargoWeight > 35 && cargoWeight <= 100 && cargoVolume < 100

    println("Груз весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $averageParameters")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $averageParameters")

}