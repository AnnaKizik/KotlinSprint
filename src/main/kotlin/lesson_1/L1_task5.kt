package org.example.lesson_1

fun main() {

    const val numberOfTimeUnits = 60
    val seconds = 6480
    val formatSeconds = seconds % numberOfTimeUnits
    val minutes: Int = seconds / numberOfTimeUnits
    val formatMinutes = minutes % numberOfTimeUnits
    val hours: Int = minutes / numberOfTimeUnits

    val timeInFormat = "%02d:%02d:%02d".format(hours, formatMinutes, formatSeconds)

    println("Время в полете: $timeInFormat")

}