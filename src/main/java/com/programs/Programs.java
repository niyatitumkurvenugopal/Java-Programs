package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programs {
    public static void main(String[] args){
        SumOfTwoNumbers s=new SumOfTwoNumbers();
        s.sum(8,4);

        SumMultiplesOfThreeAndFive sm= new SumMultiplesOfThreeAndFive();
        sm.summultiply(10);

        LinearSearch ls=new LinearSearch();
        int[] arr = new int[]{20,30,10,40,50};
        ls.search(10,arr);

        ReverseString rs= new ReverseString();
        rs. reverse("Hello World");

        FindMaximum max= new FindMaximum();
        int[] arr1 = new int[]{20,30,10,40,50};
        max.maximum(arr1);

        Factorial fc= new Factorial();
        fc.fact(5);

        FizzBuzz fb=new FizzBuzz();
        fb.fizzbuzz(10);





    }
}
