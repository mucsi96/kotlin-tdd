package a

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.time.LocalTime

class AppTest {
    @Test
    fun `greets me in the morning`() {
        assertEquals("Good morning, Igor", greet(LocalTime.of(6, 0), "Igor"))
        assertEquals("Good morning, Igor", greet(LocalTime.of(9, 0), "Igor"))
        assertEquals("Good morning, Igor", greet(LocalTime.of(11, 59), "Igor"))
    }

    @Test
    fun `greets me in the afternoon`() {
        assertEquals("Good afternoon, Igor", greet(LocalTime.of(12, 0), "Igor"))
        assertEquals("Good afternoon, Igor", greet(LocalTime.of(15, 0), "Igor"))
        assertEquals("Good afternoon, Igor", greet(LocalTime.of(16, 59), "Igor"))
    }

    @Test
    fun `greets me in the evening`() {
        assertEquals("Good evening, Igor", greet(LocalTime.of(17, 0), "Igor"))
        assertEquals("Good evening, Igor", greet(LocalTime.of(19, 0), "Igor"))
        assertEquals("Good evening, Igor", greet(LocalTime.of(21, 59), "Igor"))
    }

    @Test
    fun `greets me in the night`() {
        assertEquals("Good night, Igor", greet(LocalTime.of(22, 0), "Igor"))
        assertEquals("Good night, Igor", greet(LocalTime.of(3, 0), "Igor"))
        assertEquals("Good night, Igor", greet(LocalTime.of(4, 59), "Igor"))
    }
}