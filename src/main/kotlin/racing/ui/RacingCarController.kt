package racing.ui

import racing.domain.movement.MoveStrategy
import racing.domain.car.RacingCars

class RacingCarController(private val moveStrategy: MoveStrategy) {
    fun run(carCount: Int, tryCount: Int): List<RacingCarDtos> {
        val racingCars = RacingCars.create(carCount)
        val racingRecords = racingCars.race(tryCount, moveStrategy)
        return toDto(racingRecords)
    }

    private fun toDto(racingRecords: List<List<Int>>) =
        racingRecords.map { it -> RacingCarDtos(it.map { RacingCarDto(it) }) }
}