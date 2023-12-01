package racingcar.view

import racingcar.constants.ErrorMessage
import racingcar.constants.Strings
import racingcar.model.Car
import racingcar.model.Cars

class OutputView() {
    private val strings: Strings = Strings
    private val errorMessage: ErrorMessage = ErrorMessage

    fun outputCars() = println(strings.OUTPUT_CARS)

    fun outputTryCnt() = println(strings.OUTPUT_TRY_COUNT)

    fun outputTryResult() {
        outputLineBlank()
        println(strings.OUTPUT_TRY_RESULT)
    }

    fun outputCar(name: String, position: Int) {
        val positionResult: String = "-".repeat(position)
        println("$name : $positionResult")
    }

    fun outputWinner() = print(strings.OUTPUT_FINAL_WINNER)

    fun outputLineBlank() = println()
}