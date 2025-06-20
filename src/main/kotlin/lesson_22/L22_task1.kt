package org.example.lesson_22

class RegularBook(
    val rbName: String,
    val rbAuthor: String
)

data class DataBook(
    val dbName: String,
    val dbAuthor: String
)

fun main() {
    val regularBook1 = RegularBook("Властелин Колец", "Дж.Р.Р. Толкин")
    val regularBook2 = RegularBook("Властелин Колец", "Дж.Р.Р. Толкин")

    val dataBook1 = DataBook("1984", "Дж. Оруэлл")
    val dataBook2 = DataBook("1984", "Дж. Оруэлл")

    println(regularBook1 == regularBook2) // Результат false, т.к. сравниваются ссылки
    println(dataBook1 == dataBook2) //Результат true, т.к. сравниваются значения
}