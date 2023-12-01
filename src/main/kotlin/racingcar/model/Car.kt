package racingcar.model;

class Car(val name: String, val position: Int) {
    init {
        require(name.isNotEmpty()) {throw IllegalArgumentException(NAME_EMPTY)}
        require(name.length < NAME_SIZE_MAX) {throw IllegalArgumentException(NAME_SIZE_OVER_MAX.format(NAME_SIZE_MAX))}
    }

    companion object {
        const val NAME_SIZE_MAX = 5

        const val NAME_EMPTY = "공백인 차 이름이 있습니다."
        const val NAME_SIZE_OVER_MAX = "이름은 %d글자 이하여야 합니다."
    }
}
