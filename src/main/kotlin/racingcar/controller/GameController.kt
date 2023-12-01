package racingcar.controller

import racingcar.model.Cars
import racingcar.model.Racing
import racingcar.model.TryCount
import racingcar.view.InputView
import racingcar.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    fun run() {
        val racing = Racing(receiveCars(), receiveTryCnt())

        printRacingResult(racing)

        printRacingWinner(racing)
    }

    private fun receiveCars(): Cars {
        outputView.outputCars()
        return Cars(inputView.inputString())
    }

    private fun receiveTryCnt(): TryCount {
        outputView.outputTryCnt()
        return TryCount(inputView.inputInt())
    }

    private fun printRacingResult(racing: Racing) {
        outputView.outputTryResult()
        racing.runRacing()
    }

    private fun printRacingWinner(racing: Racing) {
        outputView.outputWinner()
        racing.printWinners()
    }
}