package a

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class AppTest {
    @Test
    fun `returns number for number not divisible by 3 or 5`() {

        listOf(1 ,2, 4, 8).forEach {
            assertEquals(it.toString(), fizzBazz(it))
            println(it)
        }
    }


    @Test
    fun `returns Fizz if the number is divisible by 3`() {
        assertEquals( "Fizz", fizzBazz(3))
        assertEquals( "Fizz", fizzBazz(3 * 2))
        assertEquals( "Fizz", fizzBazz(3 * 3))
    }

    @Test
    fun `returns Buzz if the number is divisible by 5`() {
        assertEquals( "Buzz", fizzBazz(5))
        assertEquals( "Buzz", fizzBazz(5 * 2))
        assertEquals( "Buzz", fizzBazz(5 * 4))
    }

    @Test
    fun `returns Whizz if the number is divisible by 7`() {
        assertEquals( "Whizz", fizzBazz(7))
        assertEquals( "Whizz", fizzBazz(7 * 2))
        assertEquals( "Whizz", fizzBazz(7 * 4))
    }

    @Test
    fun `returns Bang if the number is divisible by 11`() {
        assertEquals( "Bang", fizzBazz(11))
        assertEquals( "Bang", fizzBazz(11 * 2))
        assertEquals( "Bang", fizzBazz(11 * 4))
    }

    @Test
    fun `returns FizzBuzz if the number is divisible by 3 and 5`() {
        assertEquals( "FizzBuzz", fizzBazz(3 * 5))
        assertEquals( "FizzBuzz", fizzBazz(3 * 5 * 2))
        assertEquals( "FizzBuzz", fizzBazz(3 * 5 * 3))
        assertEquals( "FizzBuzz", fizzBazz(3 * 5 * 5))
    }

    @Test
    fun `returns advanced combinations`() {
        assertEquals( "FizzWhizz", fizzBazz(3 * 7))
        assertEquals( "BuzzBang", fizzBazz(5* 11))
        assertEquals( "FizzBuzzWhizzBang", fizzBazz(3*5*7* 11))
    }

}