package com.programs;

import org.junit.Test;
import static com.programs.SumTheMultiplesOfThreeAndFive.sum;
import static org.junit.jupiter.api.Assertions.*;


public class SumTheMultipliesOfThreeAndFiveTest {
    @Test
    public void sumOne(){
        assertEquals(33,sum(10));
    }

    @Test
    public void sumTwo(){
        assertEquals(60,sum(15));
    }

    @Test
    public void sumThree(){
        assertEquals(2843,sum(110));
    }


}
