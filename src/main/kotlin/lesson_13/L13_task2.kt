package org.example.lesson_13

class TelDirectory(
    val name: String,
    val number: Long,
    val company: String? = null
) {
    fun printContactInformation() =
        println("- Имя: $name\n- Номер: $number\n- Компания: ${company ?: "не указано"}")
}

fun main() {
    val contact1 = TelDirectory("Андрей", 89657809954, null)
    contact1.printContactInformation()
}
