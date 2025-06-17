package org.example.lesson_20

fun main() {

    val listOfCats = listOf("Тигр", "Рысь", "Пума", "Лев", "Ирбис", "Гепард", "Леопард", "Ягуар")

    val newListOfCats = listOfCats
        .map { cat -> "Нажат элемент $cat" }
        .filterIndexed { index, value -> (index + 1) % 2 == 0 }

    println(newListOfCats)

}