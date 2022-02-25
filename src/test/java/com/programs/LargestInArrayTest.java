package com.programs;

import org.junit.Test;
import org.junit.runners.Parameterized;
import java.util.*;
import static com.programs.LargestInArray.*;
import static org.junit.jupiter.api.Assertions.*;

public class LargestInArrayTest {
    @Parameterized.Parameter
    public static int[] arr=new int[]{280,490,360,240};
    public static int[] arr1=new int[]{24,294,258,565,537};
    public static int[] arr2=new int[]{12948,345,54,232,2};

    public static List<Integer> list= Arrays.asList(20,30,10,40,50);
    public static List<Integer> list1= Arrays.asList(8475,43635,80,356,500);

    @Test
    public void getLargestNumberOne(){
        assertEquals(490,getLargestNumber(arr));

    }

    @Test
    public void getLargestNumberTwo(){
        assertEquals(565,getLargestNumber(arr1));

    }

    @Test
    public void getLargestNumberThree(){
        assertEquals(12948,getLargestNumber(arr2));

    }

    @Test
    public void getLargestNumberStreamOne(){
        assertEquals(50,getLargestNumberStream(list));

    }

    @Test
    public void getLargestNumberStreamTwo(){
        assertEquals(43635,getLargestNumberStream(list1));

    }
}
