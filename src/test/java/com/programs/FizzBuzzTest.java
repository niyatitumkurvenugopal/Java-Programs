package com.programs;

import org.junit.Test;
import static com.programs.FizzBuzz.fizzbuzz;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void FizzBuzzOne() {

        assertEquals("1", fizzbuzz(1));
    }

    @Test
    public void FizzBuzzTwo() {

        assertEquals("2",fizzbuzz(2));
    }

    @Test
    public void FizzBuzzThree() {

        assertEquals("Fizz", fizzbuzz(3));
    }
    @Test
    public void FizzBuzzFour()
    {
            assertEquals("Buzz",fizzbuzz(5));
    }

    @Test
    public void FizzBuzzFive() {

        assertEquals("FizzBuzz",fizzbuzz(15));
            }

    @Test
    public void FizzBuzzSix() {

        assertEquals("Buzz",fizzbuzz(100));
    }
}


