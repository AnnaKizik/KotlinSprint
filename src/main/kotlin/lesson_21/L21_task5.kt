package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String = this.maxBy { it.value }.key

fun main() {
    val skills: Map<String, Int> = mapOf(
        "Ловкость" to 15,
        "Интеллект" to 12,
        "Харизма" to 15,
        "Сила" to 10
    )

    println(skills.maxCategory())
}