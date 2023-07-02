import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import timer.Timer

internal class Test {

    @Test
    fun test() {
        val timer = Timer()
        timer.start()
        timer.stop()
        val x = timer.millis
        Thread.sleep(1000)
        assertEquals(x, timer.millis)
    }
}
