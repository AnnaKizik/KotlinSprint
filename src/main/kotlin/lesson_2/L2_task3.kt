package org.example.lesson_2

fun main() {

    val departureTimeHour: Int = 9
    val departureTimeMinute: Int = 39
    val travelTime: Int = 457
    val timeUnit = 60

    val arrivalTimeHour: Int = departureTimeHour + (departureTimeMinute + travelTime) / timeUnit
    val arrivalTimeMinute: Int = (departureTimeMinute + travelTime) % timeUnit

    println("Время прибытия поезда: $arrivalTimeHour:$arrivalTimeMinute")

}