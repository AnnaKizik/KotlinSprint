package org.example.lesson_19

class Person(
    val name: String,
    val sex: Sex
)

fun main() {
    println(
        """
      Введите имя и пол в формате: Имя SEX
      Доступные варианты пола: MALE, FEMALE
    """.trimIndent()
    )

    val cardFileData = mutableListOf<Person>()

    while (cardFileData.size < 5) {
        print("Введите имя и пол (${cardFileData.size + 1}/5):")
        val input = readln().trim().split("\\s+".toRegex())
        if (input.size != 2) {
            println("Ошибка при вводе: пропущен пробел\nПопробуйте снова")
            continue
        }

        try {
            val sex = Sex.valueOf(input[1].uppercase())
            cardFileData.add(Person(input[0], sex))
        } catch (e: IllegalArgumentException) {
            println("Неправильно указан пол. Попробуйте снова")
        }
    }

    cardFileData.forEach { person ->
        println("Имя: ${person.name}\nПол: ${person.sex.rusName}\n")
    }
}

enum class Sex(val rusName: String) {
    MALE("мужской"),
    FEMALE("женский")
}
