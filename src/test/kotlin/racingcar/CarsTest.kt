package racingcar

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.model.Cars

class CarsTest {
    @Test
    fun `차가 15대를 초과할 시 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Cars("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16")
        }
    }

    @Test
    fun `동일한 이름의 차가 입력되면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Cars("sh,sh")
        }
    }

    @Test
    fun `차이름이 5글자를 넘어가면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Cars("여섯글자예요,다섯글자야")
        }
    }

    @Test
    fun `차이름이 공백이면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Cars("1, ,16")
        }
    }
}