package org.example.lesson_12

const val KEL_TO_CEL = 273.15

class Weather2(dayTemKelvin: Int, nightTemKelvin: Int, _downfall: Boolean) {
    var dayTemperature = dayTemKelvin
    var nightTemperature = nightTemKelvin
    val downfall = _downfall

    init {
        dayTemperature = (dayTemperature - KEL_TO_CEL).toInt()
        nightTemperature = (nightTemperature - KEL_TO_CEL).toInt()
        weatherForecast()
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

    val day = Weather2(300, 295, false)

}