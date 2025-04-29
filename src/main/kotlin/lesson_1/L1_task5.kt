package org.example.lesson_1

const val NUMBER_OF_UNITS = 60

fun main() {

    val seconds = 6480
    val formatSeconds = seconds % NUMBER_OF_UNITS
    val minutes: Int = seconds / NUMBER_OF_UNITS
    val formatMinutes = minutes % NUMBER_OF_UNITS
    val hours: Int = minutes / NUMBER_OF_UNITS

    val timeInFormat = "%02d:%02d:%02d".format(hours, formatMinutes, formatSeconds)

    println("Время в полете: $timeInFormat")

}