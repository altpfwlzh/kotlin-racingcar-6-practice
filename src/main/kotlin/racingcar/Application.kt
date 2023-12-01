package racingcar

import racingcar.controller.GameController
import racingcar.misc.ExceptionHandler
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    runCatching {
        val gameController = GameController(InputView(), OutputView(), ExceptionHandler())
        gameController.run()
    }.onFailure {
        ExceptionHandler().printError(it.message)
    }
}
