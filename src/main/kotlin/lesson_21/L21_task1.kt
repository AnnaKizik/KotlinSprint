package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
    return lowercase().count { it in vowels }
}

fun main() {
    val word1 = "Авокадо"
    val word2 = "Seashell"

    println(word1.vowelCount())
    println(word2.vowelCount())
}