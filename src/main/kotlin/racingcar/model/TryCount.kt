package racingcar.model

class TryCount(val count: Int) {
    init {
        require(count >= MIN_CNT) {throw IllegalArgumentException(CNT_NOT_IN_RANGE.format(MIN_CNT, MAX_CNT))}
        require(count <= MAX_CNT) {throw IllegalArgumentException(CNT_NOT_IN_RANGE.format(MIN_CNT, MAX_CNT))}
    }

    companion object {
        const val MIN_CNT = 1
        const val MAX_CNT = 20

        const val CNT_NOT_IN_RANGE = "시도 횟수는 %d ~ %d 여야합니다."
    }
}
