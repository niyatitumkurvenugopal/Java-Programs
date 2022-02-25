package com.programs;

import org.junit.Test;
import static com.programs.SumOfTwoNumbers.sum;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfTwoNumbersTest {
    @Test
    public void sumOne(){
        assertEquals(10,sum(5,5));
    }

    @Test
    public void sumTwo(){
        assertEquals(150,sum(50,100));
    }

    @Test
    public void sumThree(){
        assertEquals(458,sum(455,3));
    }


}