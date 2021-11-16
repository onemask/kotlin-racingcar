package step3.ui

import step3.Car
import step3.Round

object Output {
    fun printResult(cars: List<Car>, round: Round) {
        println(RESULT_OF_EXECUTE)
        printCars(cars, round)
    }

    private fun printCars(cars: List<Car>, round: Round) {
        var list = cars
        repeat(round.number) {
            list = list.map {
                it.move()
            }
            printCar(list)
        }
    }

    private fun printCar(car: List<Car>) {
        car.forEach {
            println(printForward(it))
        }
        println(END_OF_LINE)
    }

    private fun printForward(car: Car): String {
        val stringBuilder = StringBuilder()
        (0 until car.forward).map {
            stringBuilder.append(FORWARD_MARK)
        }
        return stringBuilder.toString()
    }
}

const val FORWARD_MARK = "-"
const val END_OF_LINE = "!-- End of line --!"
const val RESULT_OF_EXECUTE = "실행 결과"
