package racingcar.model

class Cars(private val cars: List<Car>) {
    constructor(input: String) : this(input.split(",").map { Car(it, 0) })
}