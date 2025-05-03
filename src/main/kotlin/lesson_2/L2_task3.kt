package org.example.lesson_2

const val TIME_UNT = 60

fun main() {

    val departureTimeHour: Int = 9
    val departureTimeMinute: Int = 39
    val travelTime: Int = 457

    val arrivalTimeHour: Int = departureTimeHour + (departureTimeMinute + travelTime) / TIME_UNT
    val arrivalTimeMinute: Int = (departureTimeMinute + travelTime) % TIME_UNT

    println("Время прибытия поезда: ${"%02d:%02d".format(arrivalTimeHour, arrivalTimeMinute)}")

}