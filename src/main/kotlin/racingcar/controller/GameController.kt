package racingcar.controller

import racingcar.misc.ExceptionHandler
import racingcar.model.Cars
import racingcar.model.Racing
import racingcar.model.TryCount
import racingcar.view.InputView
import racingcar.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val exceptionHandler: ExceptionHandler,
) {
    fun run() {
        val racing: Racing = Racing(receiveCars(), receiveTryCnt())
    }

    private fun receiveCars(): Cars {
        inputView.inputString()
        TODO()//return Cars()
    }

    private fun receiveTryCnt(): TryCount {
        return TryCount(1)
    }


}