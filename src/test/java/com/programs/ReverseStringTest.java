package com.programs;

import org.junit.Test;
import static com.programs.ReverseString.reverse;
import static com.programs.ReverseString.reverseStream;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    @Test
    public void reverseStringOne(){

        assertEquals("dlrow olleH",reverse("Hello world"));
    }

    @Test
    public void reverseStringTwo(){
        assertEquals(".uoy era woH, iH",reverse("Hi ,How are you."));
    }

    @Test
    public void reverseStreamOne(){
        assertEquals("doog",reverseStream("good"));
    }

    @Test
    public void reverseStreamTwo(){
        assertEquals("avaj",reverseStream("java"));
    }

}