package org.example.lesson_22

data class MammalScientificName(
    val order: String,
    val family: String,
    val genus: String,
    val species: String
)

fun main() {

    val mammal = MammalScientificName(
        "Primates",
        "Lorisidae",
        "Perodicticus",
        "Potto"
    )

    val (order, family, genus, species) = mammal

    val _order = mammal.component1()
    val _family = mammal.component2()
    val _genus = mammal.component3()
    val _species = mammal.component4()

    println(_order)
    println(_family)
    println(_genus)
    println(_species)
}