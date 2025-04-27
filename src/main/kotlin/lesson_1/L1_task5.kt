package org.example.lesson_1

fun main() {

    val seconds = 6480
    val formatSeconds = seconds % 60
    val minutes: Int = seconds / 60
    val formatMinutes = minutes % 60
    val hours: Int = minutes / 60

    val timeInFormat = String.format("%02d:%02d:%02d", hours, formatMinutes, formatSeconds)

    println("Время в полете: $timeInFormat")

}