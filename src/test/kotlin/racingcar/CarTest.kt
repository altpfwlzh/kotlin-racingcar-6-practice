package racingcar

import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.model.Car

class CarTest : NsTest()  {
    @Test
    fun `스피드가 4면 position이 증가하는지 확인`() {
        val car = Car("shuru", 0)
        car.moveForwardIfOverStandardSpeed(4)
        val result = car.printCar()
        assertThat(output()).contains("shuru : -")
    }

    override fun runMain() {
        main()
    }
}