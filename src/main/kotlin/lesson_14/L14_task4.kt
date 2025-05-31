package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean
)

open class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
    var satellites: List<Satellite> = listOf()
) : CelestialBody(name, hasAtmosphere, suitableForLanding) {

    fun showInfoAboutSatellite() {
        println("Планета: $name")
        satellites.forEachIndexed { index, satellite ->
            println("Спутник №${index + 1}: ${satellite.name}")
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, suitableForLanding)

fun main() {

    val satellite1 = Satellite("Фобос", false, false)
    val satellite2 = Satellite("Деймос", false, false)
    val planet = Planet("Марс", false, true, listOf(satellite1, satellite2))

    planet.showInfoAboutSatellite()

}