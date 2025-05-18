package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 273.15

class Weather1(dayTemKelvin: Int, nightTemKelvin: Int, _downfall: Boolean) {
    var dayTemperature = dayTemKelvin
    var nightTemperature = nightTemKelvin
    val downfall = _downfall

    init {
        dayTemperature = (dayTemperature - KELVIN_TO_CELSIUS).toInt()
        nightTemperature = (nightTemperature - KELVIN_TO_CELSIUS).toInt()
    }

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