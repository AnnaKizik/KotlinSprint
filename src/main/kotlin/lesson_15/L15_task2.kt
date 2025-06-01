package org.example.lesson_15

abstract class WeatherStationStats(
    val value: Int
) {
    abstract fun createMessage()
}

class Temperature(
    value: Int
) : WeatherStationStats(value = value) {
    override fun createMessage() {
        println("Температура воздуха: $value oC")
    }
}

class PrecipitationAmount(
    value: Int
) : WeatherStationStats(value = value) {
    override fun createMessage() {
        println("Количество осадков: $value мм")
    }
}

class WeatherServer() {
    fun sendMessage(message: WeatherStationStats) {
        message.createMessage()
    }
}

fun main() {

    val temp = Temperature(22)
    val prec = PrecipitationAmount(708)
    val todayReport = WeatherServer()

    todayReport.sendMessage(temp)
    todayReport.sendMessage(prec)

}

