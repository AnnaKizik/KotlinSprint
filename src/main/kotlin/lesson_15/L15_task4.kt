package org.example.lesson_15

interface Searching {
    fun searchGood() {
        println("Выполнется поиск...")
    }
}

abstract class Goods(
    val name: String,
    val inStock: Int
)

class Component(name: String, inStock: Int) : Goods(name, inStock)

class Instrument(name: String, inStock: Int) : Goods(name, inStock), Searching

fun main() {

    val strings = Component("Струны", 200)
    val guitar = Instrument("Гитара", 32)

    guitar.searchGood()

}