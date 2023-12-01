package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.util.Validator

class InputView {
    private val validator: Validator = Validator()

    fun inputString(): String {
        val input: String = Console.readLine()
        validator.checkString(input)
        return input
    }

    fun inputInt(): Int {
        val input: String = Console.readLine()
        validator.checkInt(input)
        return input.toInt()
    }

}