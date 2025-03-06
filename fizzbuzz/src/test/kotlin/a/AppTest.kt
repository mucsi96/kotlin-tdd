package a

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class AppTest {
    @Test
    fun `returns number for number not divisible by 3 or 5`() {

        listOf(1 ,2, 4, 7).forEach {
            assertEquals(it.toString(), fizzBazz(it))
            println(it)
        }
    }


    @Test
    fun `returns Fizz if the number is divisible by 3`() {
        assertEquals( "Fizz", fizzBazz(3))
        assertEquals( "Fizz", fizzBazz(6))
        assertEquals( "Fizz", fizzBazz(9))
    }

    @Test
    fun `returns Buzz if the number is divisible by 5`() {
        assertEquals( "Buzz", fizzBazz(5))
        assertEquals( "Buzz", fizzBazz(10))
        assertEquals( "Buzz", fizzBazz(20))
    }

    @Test
    fun `returns FizzBuzz if the number is divisible by 3 and 5`() {
        assertEquals( "FizzBuzz", fizzBazz(15))
        assertEquals( "FizzBuzz", fizzBazz(45))
        assertEquals( "FizzBuzz", fizzBazz(60))
    }
}