package step3

import step3.ui.Input

object CarsFactory {
    fun makeCars(): List<Car> {
        return (1..Input.getCountOfCar()).map {
            Car()
        }
    }
}

const val DEFAULT_NUMBER_OF_COUNT = 0
