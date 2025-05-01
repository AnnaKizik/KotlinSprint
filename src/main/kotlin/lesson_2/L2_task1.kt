package org.example.lesson_2

fun main() {

    val studentsGrades = arrayOf(3, 4, 3, 5)
    val averageGrade = studentsGrades.sum().toFloat() / studentsGrades.size

    println("Средний балл класса: $averageGrade")

}
