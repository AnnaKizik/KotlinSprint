package org.example.lesson_21

import java.io.File

fun File.saveWordToFile(word: String): File {
    if (this.exists()) this.readText()
    this.writeText(word.lowercase())
    return this
}

fun main() {
    val file1 = File("file1.txt")
    file1.saveWordToFile("Cобака")
}