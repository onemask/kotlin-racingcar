package step3

data class Cars(val carList: MutableList<Car> = mutableListOf()) {

    fun makeCar(numberOfCount: Int): List<Car> {
        for (i in DEFAULT_NUMBER_OF_COUNT until numberOfCount) {
            carList.add(Car())
        }
        return carList
    }

    fun moveCars() {
        carList.forEachIndexed { index, car ->
            carList[index] = car.move()
        }
    }
}

const val DEFAULT_NUMBER_OF_COUNT = 0
