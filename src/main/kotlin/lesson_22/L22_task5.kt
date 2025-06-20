package org.example.lesson_22

data class GalaticGuide(
    val name: String,
    val decription: String,
    val dateAndTime: String,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalaticGuide(
        "Alpha Centauri",
        "Ближайшая к Солнцу зведная система",
        "15.08.2025 (13:00)",
        4.36
    )

    println(
        """
        Название места: ${alphaCentauri.component1()}
        Описание места: ${alphaCentauri.component2()}
        Дата и время события: ${alphaCentauri.component3()}
        Расстояние от Земли в световых годах: ${alphaCentauri.component4()}
    """.trimIndent()
    )
}