package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 273.15

class Weather1(dayTemKelvin: Int, nightTemKelvin: Int, _downfall: Boolean) {
    var dayTemperature = (dayTemKelvin - KELVIN_TO_CELSIUS).toInt()
    var nightTemperature = (nightTemKelvin - KELVIN_TO_CELSIUS).toInt()
    val downfall = _downfall

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

    val day = Weather1(300, 295, false)
    day.weatherForecast()

}