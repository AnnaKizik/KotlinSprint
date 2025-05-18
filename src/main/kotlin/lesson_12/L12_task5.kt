package org.example.lesson_12

const val KELV_TO_CELS = 273.15

class DayWeather(dayTemKelvin: Int, nightTemKelvin: Int, _downfall: Boolean) {
    var dayTemperature = dayTemKelvin
    var nightTemperature = nightTemKelvin
    val downfall = _downfall

    init {
        dayTemperature = (dayTemperature - KELV_TO_CELS).toInt()
        nightTemperature = (nightTemperature - KELV_TO_CELS).toInt()
    }

}

fun main() {

    val minTempKelvin = 200
    val maxTempKelvin = 330
    val daysInMonth = 30

    val monthData = mutableListOf<DayWeather>()

    for (i in 1..daysInMonth) {
        val day = DayWeather(
            (minTempKelvin..maxTempKelvin).random(),
            (minTempKelvin..maxTempKelvin).random(),
            Math.random() >= 0.5
        )
        monthData.add(day)
    }

    val dayTemps = monthData.map { it.dayTemperature }
    val nightTemps = monthData.map { it.nightTemperature }
    val daysWithDownfall = monthData.count { it.downfall }

    val averageDayTem = dayTemps.sum() / dayTemps.size
    val averageNightTem = nightTemps.sum() / nightTemps.size

    println("Среднемесячная дневная температура: ${averageDayTem}oC")
    println("Среднемесячная ночная температура: ${averageNightTem}oC")
    println("Количество дней с осадками: $daysWithDownfall дней")

}