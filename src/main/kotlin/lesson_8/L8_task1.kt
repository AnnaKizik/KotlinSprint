package org.example.lesson_8

fun main() {

    val viewsPerDay = arrayOf(34, 56, 67, 42, 12, 32, 66)
    var weekViews = 0

    for (i in viewsPerDay) {
        weekViews = weekViews + i
    }

    println("Количество просмотров рекламы за неделю: $weekViews")

}