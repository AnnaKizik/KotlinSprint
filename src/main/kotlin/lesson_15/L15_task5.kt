package org.example.lesson_15

interface Drivable {
    fun drive() {
        println("Едем...")
    }
}

interface Passengers {
    var currentPassengers: Int
    val maxPassengers: Int

    fun loadPassenger(passengersNumber: Int) {
        if (currentPassengers + passengersNumber <= maxPassengers) {
            println("Посажено $passengersNumber пассажиров")
            currentPassengers = currentPassengers + passengersNumber
        } else
            println("Свободных мест нет")
    }

    fun unloadPassenger(passengersNumber: Int) {
        if (currentPassengers - passengersNumber >= 0) {
            println("Высажено $passengersNumber пассажиров")
            currentPassengers = currentPassengers - passengersNumber
        } else
            println("Транспорт пуст!")
    }
}

interface Cargo {
    var currentCargo: Int
    val maxCargo: Int

    fun loadCargo(cargoWeight: Int) {
        if (currentCargo + cargoWeight <= maxCargo) {
            println("Загружено $cargoWeight т груза")
            currentCargo = currentCargo + cargoWeight
        } else
            println("Машина перегружена!")
    }

    fun unloadCargo(cargoWeight: Int) {
        if (cargoWeight <= currentCargo) {
            println("Выгружено $cargoWeight т груза")
            currentCargo = currentCargo - cargoWeight
        } else
            println("Машина пуста!")
    }
}

class Truck(
    override var currentPassengers: Int = 0,
    override val maxPassengers: Int = 1,
    override var currentCargo: Int = 0,
    override val maxCargo: Int = 2
) : Drivable, Passengers, Cargo


class Car(
    override var currentPassengers: Int = 0,
    override val maxPassengers: Int = 3
) : Drivable, Passengers

fun main() {

    val truck = Truck()
    val car = Car()

    car.loadPassenger(3)
    car.drive()
    car.unloadPassenger(3)
    car.drive()
    car.loadPassenger(2)
    car.drive()
    car.unloadPassenger(2)

    truck.loadPassenger(1)
    truck.loadCargo(2)
    truck.drive()
    truck.unloadPassenger(1)
    truck.unloadCargo(2)

}