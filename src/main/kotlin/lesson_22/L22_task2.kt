package org.example.lesson_22

class RegularBook1(
    val rbName: String,
    val rbAuthor: String
) {
    override fun toString(): String {
        return "RegularBook1(rbName='$rbName', rbAuthor='$rbAuthor')"
    }
}

data class DataBook1(
    val dbName: String,
    val dbAuthor: String
)

fun main() {
    val regularBook1 = RegularBook1("Властелин Колец", "Дж.Р.Р. Толкин")
    val dataBook1 = DataBook1("1984", "Дж. Оруэлл")

    println(regularBook1)
    println(dataBook1)
    /*
    В первом случае объект обычного класса выводится в виде "читаемой" строки за счет переопределения функции toString()
    Во втором случае объект data класса выводится в виде читаемой строки за счет автоматически переопределенной функции to String()
    */
}