package racingcar.model;

import racingcar.util.RandNumGenerator
import racingcar.view.OutputView

class Car(val name: String, var position: Int) {
    init {
        require(name.isNotEmpty()) { throw IllegalArgumentException(NAME_EMPTY) }
        require(name.length < NAME_SIZE_MAX) { throw IllegalArgumentException(NAME_SIZE_OVER_MAX.format(NAME_SIZE_MAX)) }
    }

    fun moveForwardIfOverStandardSpeed(standardSpeed: Int) {
        if(isSpeedOverStandard(standardSpeed)) position++
    }

    private fun isSpeedOverStandard(standardSpeed: Int): Boolean =
        (RandNumGenerator().generateRandNum(RAND_START_NUM, RAND_END_NUM) >= standardSpeed)

    fun printCar() {
        OutputView().outputCar(name, position)
    }

    companion object {
        const val NAME_SIZE_MAX = 5

        const val RAND_START_NUM = 1
        const val RAND_END_NUM = 9

        const val NAME_EMPTY = "공백인 차 이름이 있습니다."
        const val NAME_SIZE_OVER_MAX = "이름은 %d글자 이하여야 합니다."
    }
}
