package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean
)

open class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : CelestialBody(name, hasAtmosphere, suitableForLanding)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, suitableForLanding)

fun main() {

    val planet = Planet("Марс", false, true)
    val satellite1 = Satellite("Фобос", false, false)
    val satellite2 = Satellite("Деймос", false, false)

    planet.satellites.add(satellite1)
    planet.satellites.add(satellite2)

    println("Планета: ${planet.name}")
    planet.satellites.forEachIndexed { index, satellite ->
        println("Спутник №${index + 1}: ${satellite.name}")
    }

}
