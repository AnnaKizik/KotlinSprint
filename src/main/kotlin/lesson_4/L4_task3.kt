package org.example.lesson_4

fun main() {

    val sunnyWeather: Boolean = true
    val openTent: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    println("Благоприятные ли сейчас условия для роста бобовых? – ${sunnyWeather && openTent && humidity == 20 && season != "зима"}")

}