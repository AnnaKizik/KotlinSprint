package org.example.lesson_4

const val SUNNY_WEATHER: Boolean = true
const val OPEN_TENT: Boolean = true
const val HUMIDITY: Int = 20
const val SEASON: String = "не зима"

fun main() {

    val sunnyWeather: Boolean = true
    val openTent: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    println("Благоприятные ли сейчас условия для роста бобовых? – ${sunnyWeather == SUNNY_WEATHER && openTent == OPEN_TENT && humidity == HUMIDITY && season == SEASON}")

}