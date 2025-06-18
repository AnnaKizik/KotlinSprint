package org.example.lesson_21

import java.io.File

fun File.saveWordToFile(word: String): File {
    val newFile = File("word.txt")
    if (newFile.exists()) newFile.readText()
    newFile.writeText(word.lowercase())
    return newFile
}

fun main() {
    val file1 = File("file1.txt")
    file1.saveWordToFile("Cобака")
}