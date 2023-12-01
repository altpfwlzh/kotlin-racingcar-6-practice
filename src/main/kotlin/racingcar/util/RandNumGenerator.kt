package racingcar.util

import camp.nextstep.edu.missionutils.Randoms

class RandNumGenerator {
    fun generateRandNum(startNum: Int, endNum: Int): Int = Randoms.pickNumberInRange(startNum, endNum)
}