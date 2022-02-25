package com.programs;

import org.junit.Test;
import static com.programs.Factorial.fact;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void factorialZero() {
        assertEquals(1,fact(0));
    }

    @Test
    public void factorialOne() {
        assertEquals(1,fact(1));
    }

    @Test
    public void factorialThree() {
        assertEquals(6,fact(3));
    }

    @Test
    public void factorialFive() {
        assertEquals(120,fact(5));
    }
}