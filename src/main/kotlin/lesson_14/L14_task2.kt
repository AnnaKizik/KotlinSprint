package org.example.lesson_13

open class Liner1(
    val numberOfPassengers: Int = 5000,
    val speed: Double = 50.3,
) {
    open fun loadMethod(){
        println("Выдвигается горизонтальный трап со шкафута")
    }

    open fun shipInfo(){
       println("""
           Информация о корабле
           Количество пассажиров: $numberOfPassengers
           Скорость: $speed
       """.trimIndent())
    }

}

class Cargo1(
    val loadCapacity: Int
): Liner1(numberOfPassengers = 10, speed = 22.6){

    override fun loadMethod() {
        println("\nПогрузочный кран активирован")
    }

    override fun shipInfo() {
        super.shipInfo()
        println("Грузоподъемность: $loadCapacity\n")
    }

}

class Icebreaker1(
    val breakIce: Boolean
): Liner1(numberOfPassengers = 60, speed = 20.2){
    override fun loadMethod() {
        println("Открываются ворота со стороны кормы")
    }

    override fun shipInfo() {
        super.shipInfo()
        println("Может идти по льду: $breakIce")
    }
}

fun main(){

    val liner = Liner1()
    liner.loadMethod()
    liner.shipInfo()

    val cargo = Cargo1(8000)
    cargo.loadMethod()
    cargo.shipInfo()

    val icebreaker = Icebreaker1(true)
    icebreaker.loadMethod()
    icebreaker.shipInfo()

}

