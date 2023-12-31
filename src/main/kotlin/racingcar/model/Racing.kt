package racingcar.model

import racingcar.view.OutputView

class Racing(private val cars: Cars, private val tryCnt: TryCount) {
    fun runRacing() {
        repeat(tryCnt.count) {
            cars.runCarsOneTurn(STANDARD_SPEED)
            cars.printCars()
            OutputView().outputLineBlank()
        }
    }

    fun printWinners() = println(cars.calculateWinners().joinToString(",") { it.name })

    companion object {
        const val STANDARD_SPEED = 4
    }
}