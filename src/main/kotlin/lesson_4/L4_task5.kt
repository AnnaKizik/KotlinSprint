package org.example.lesson_4


fun main() {

    print("Наличие повреждений (true/false): ")
    val damage = readln().toBoolean()

    print("Численность экипажа: ")
    val crewNumber = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provisionBoxAmount = readln().toInt()

    print("Метеоусловия благоприятны (true/false): ")
    val goodMeteoconditions = readln().toBoolean()

    print("Можно отправляться в плавание: ${(!damage && crewNumber in 55..70 && provisionBoxAmount > 50) || (crewNumber == 70 && provisionBoxAmount >= 50 && goodMeteoconditions)}")

}