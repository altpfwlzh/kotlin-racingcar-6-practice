package racingcar

import racingcar.controller.GameController
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val gameController = GameController(InputView(), OutputView())
    gameController.run()
}
