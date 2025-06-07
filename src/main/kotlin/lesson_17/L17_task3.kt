package org.example.lesson_17

class Folder(
    private val realName: String,
    private var realFilesNumber: Int,
    private val isSecret: Boolean
) {
    val name: String
        get() = if (isSecret) "скрытая папка" else realName

    val filesNumber: Int
        get() = if (isSecret) 0 else realFilesNumber
}

fun main() {
    val folder1 = Folder("Мои документы", 12, true)
    println("Название папки: ${folder1.name}\nКоличество файлов в папке: ${folder1.filesNumber}")
}