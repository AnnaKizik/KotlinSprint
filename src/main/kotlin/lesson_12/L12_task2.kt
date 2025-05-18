package org.example.lesson_12

class WeatherParameters(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val downfall: Boolean
) {
    fun weatherForecast() {
        println(
            """
            Температура днем: $dayTemperature C
            Температура ночью: $nightTemperature C
            Осадки: $downfall
        """.trimIndent()
        )
    }
}

fun main() {

    val day = WeatherParameters(29, 26, true)
    day.weatherForecast()
}