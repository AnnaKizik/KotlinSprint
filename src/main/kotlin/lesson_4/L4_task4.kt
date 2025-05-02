package org.example.lesson_4

const val PARITY_CHECK = 2

fun main() {

    val dayOfTraining = 1
    val groupOfExercises = dayOfTraining % PARITY_CHECK

    println(
        """
        Упражнения для рук: ${groupOfExercises == 1}
        Упражнения для ног: ${groupOfExercises == 0}
        Упражнения для спины: ${groupOfExercises == 0}
        Упражнения для пресса: ${groupOfExercises == 1}
    """.trimMargin()
    )

}