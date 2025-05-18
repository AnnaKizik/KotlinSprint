package org.example.lesson_12

class Weather() {

    var dayTemperature = 23
    var nightTemperature = 20
    var downfall = false

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

    val day1 = Weather()
    val day2 = Weather()

    day1.dayTemperature = 28
    day1.nightTemperature = 25
    day1.downfall = false
    day1.weatherForecast()

    day2.dayTemperature = 17
    day2.nightTemperature = 15
    day2.downfall = true
    day2.weatherForecast()
    
}