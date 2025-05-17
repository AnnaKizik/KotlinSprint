package org.example.lesson_4

const val DAMAGE = false
const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val MIN_PROVISION_AMOUNT = 50
const val GOOD_METEOCONDITIONS = true


fun main() {

    print("Наличие повреждений (true/false): ")
    val damage = readln().toBoolean()

    print("Численность экипажа: ")
    val crewNumber = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provisionBoxAmount = readln().toInt()

    print("Метеоусловия благоприятны (true/false): ")
    val goodMeteoconditions = readln().toBoolean()

    print("Можно отправляться в плавание: ${(damage != DAMAGE && crewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER && provisionBoxAmount > MIN_PROVISION_AMOUNT) || (crewNumber == MAX_CREW_NUMBER && provisionBoxAmount >= MIN_PROVISION_AMOUNT && goodMeteoconditions == GOOD_METEOCONDITIONS)}")

}