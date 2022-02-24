package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programs {
    public static void main(String[] args){
        int[] arr = new int[]{20,30,10,40,50};
        List<Integer> list=Arrays.asList(20,30,10,40,50);

        System.out.println("Sum of 2 Numbers : "+SumOfTwoNumbers.sum(8,4));

        System.out.println("Sum and multiply of three and five : "+SumMultiplesOfThreeAndFive.sumMultiply(10));

        System.out.println("Linear search : "+ LinearSearch.searchTheNumber(10,arr));

        System.out.println("Reverse String : " + ReverseString. reverse("Hello World") +" and Reverse  String using stream :"+ReverseStringStream.reverseStream("Hello World"));

        System.out.println("Largest Number : "+ FindMaximum.getLargestNumber(arr) +"and Largest Number Using Stream : "+ FindMaximumStream.getLargestNumberStream(list));

        System.out.println("Factorial of a number : "+ Factorial.fact(5));

        System.out.println("FizzBuzz : "+ FizzBuzz.fizzbuzz(10));





    }
}
