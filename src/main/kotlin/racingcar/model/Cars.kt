package racingcar.model

class Cars(private val cars: List<Car>) {
    init {
        if(cars.size < CAR_NUM_MIN) throw IllegalArgumentException(CAR_NUM_UNDER_MIN.format(CAR_NUM_MIN))
        if(cars.size > CAR_NUM_MAX) throw IllegalArgumentException(CAR_NUM_OVER_MAX.format(CAR_NUM_MAX))
    }

    constructor(input: String) : this(input.split(",").map { Car(it, 0) })

    companion object {
        const val CAR_NUM_MIN = 2
        const val CAR_NUM_MAX = 15

        const val CAR_NUM_UNDER_MIN = "차를 %d 대 이상 입력해야 합니다."
        const val CAR_NUM_OVER_MAX = "차는 %d대까지만 입력할 수 있습니다."
    }
}