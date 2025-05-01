package org.example.lesson_2

fun main() {

    val numberOfPermanentEmployees = 50
    val fullTimeSalary = 30000
    val numberOfTrainees = 30
    val partTimeSalary = 20000

    val expensesForPermanentEmployees: Int = numberOfPermanentEmployees * fullTimeSalary
    val generalExpenses: Int = expensesForPermanentEmployees + (numberOfTrainees * partTimeSalary)
    val averageSalary: Int = generalExpenses / (numberOfPermanentEmployees + numberOfTrainees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesForPermanentEmployees руб.")
    println("Общие расходы на выплату зарплаты: $generalExpenses руб.")
    println("Средняя зарплата: $averageSalary руб.")

}
