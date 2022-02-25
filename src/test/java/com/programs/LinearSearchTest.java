package com.programs;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static com.programs.LinearSearch.searchTheNumber;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {
    @Parameterized.Parameter
    public static int[] arr=new int[]{280,490,360,240};
    public static int[] arr1=new int[]{24,294,258,565,537};
    public static int[] arr2=new int[]{12948,345,54,232,2};

    @Test
    public void linearSearchOne(){
        assertEquals(2,searchTheNumber(360,arr));
    }

    @Test
    public void linearSearchTwo(){
        assertEquals(-1,searchTheNumber(25,arr1));
    }

    @Test
    public void linearSearchThree(){
        assertEquals(4,searchTheNumber(2,arr2));
    }
}