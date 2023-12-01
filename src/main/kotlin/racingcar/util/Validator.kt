package racingcar.util

import racingcar.constants.ErrorMessage

class Validator {
    private val errorMessage: ErrorMessage = ErrorMessage

    private fun checkEmpty(input: String) {
        if(input.isEmpty()) throw IllegalArgumentException(errorMessage.INPUT_EMPTY)
    }

    private fun checkTypeInt(input: String) {
        require(input.chars().allMatch{ Character.isDigit(it) }) {
            throw IllegalArgumentException(errorMessage.INPUT_TYPE_NOT_INT)
        }
    }
}