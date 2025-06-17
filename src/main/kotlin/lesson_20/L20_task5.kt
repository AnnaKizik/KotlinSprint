package org.example.lesson_20

class Robot {
    private val listOfPhrases = listOf(
        "Готов к работе!",
        "Привет!",
        "Как дела?",
        "Чем могу помочь?",
        "Низкий уровень заряда!",
    )
    private val randomPhrase = listOfPhrases.random()
    private var currentModifier: (String) -> String = { it }

    fun say() {
        println(currentModifier(randomPhrase))
    }

    fun setModifier(modifier: (String) -> String) {
        currentModifier = modifier
    }
}

fun main() {
    val invert: (String) -> String = { phrase ->
        phrase.reversed()
    }

    val robot1 = Robot()

    robot1.say()
    robot1.setModifier(invert)
    robot1.say()
}