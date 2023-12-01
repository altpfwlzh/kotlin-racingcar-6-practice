package racingcar

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import racingcar.model.Cars

class CarsTest {
    @Test
    fun `String을 넣었을 때 올바르게 들어가는지 확인`() {
        val result = Cars("pobi,woni,jun")
        Assertions.assertEquals(result, "[pobi,woni,jun]")
    }
}