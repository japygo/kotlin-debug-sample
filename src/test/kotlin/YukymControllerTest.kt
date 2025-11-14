import com.survivalcoding.YukymController
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDateTime
import kotlin.test.Test

class YukymControllerTest {
    @Test
    fun `해당 월에 맞는 자시의 국 표시된다`() {
        assertMonthRange(1..2, "경오1국")
        assertMonthRange(3..4, "경오2국")
        assertMonthRange(5..6, "경오3국")
        assertMonthRange(7..8, "경오4국")
        assertMonthRange(9..10, "경오5국")
        assertMonthRange(11..12, "경오6국")
    }

    @Test
    fun `해당 시간에 맞는 자시의 국 표시된다`() {
        assertHourRange(0..<2, "갑자1국")
        assertHourRange(2..<4, "갑자12국")
        assertHourRange(4..<6, "갑자2국")
        assertHourRange(6..<8, "갑자3국")
        assertHourRange(8..<10, "갑자4국")
        assertHourRange(10..<12, "갑자5국")
        assertHourRange(12..<14, "갑자6국")
        assertHourRange(14..<16, "갑자12국")
        assertHourRange(16..<18, "갑자7국")
        assertHourRange(18..<20, "갑자8국")
        assertHourRange(20..<22, "갑자9국")
        assertHourRange(22..<24, "갑자10국")
    }

    private fun assertMonthRange(months: IntRange, expected: String) {
        months.forEach { month ->
            // given
            val now = LocalDateTime.of(2020, month, 2, 2, 22)
            val yukymController = YukymController(now)

            // when
            val tyA = yukymController.getTyA()

            // then
            assertEquals(expected, tyA)
        }
    }

    private fun assertHourRange(hours: IntRange, expected: String) {
        hours.forEach { hour ->
            // given
            val now = LocalDateTime.of(2020, 2, 2, hour, 22)
            val yukymController = YukymController(now)

            // when
            val tyB = yukymController.getTyB()

            // then
            assertEquals(expected, tyB)
        }
    }
}
