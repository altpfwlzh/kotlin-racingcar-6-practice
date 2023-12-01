package racingcar.model


class Racing(private val cars: Cars, private val tryCnt: TryCount) {
    fun runRacing() {
        repeat(tryCnt.count) {
            cars.runCars(STANDARD_SPEED)
        }
    }

    companion object {
        const val STANDARD_SPEED = 4
    }
}