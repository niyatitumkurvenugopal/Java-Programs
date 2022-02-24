package com.programs;

public class FizzBuzz {
    public static String fizzbuzz(int i){
        if(i%3==0 && i%5==0){
            return "FizzBuzz";
        }
        if(i%3==0){
            return "Fizz";
        }
        if(i%5==0){
            return"Buzz";
        }
        else{
            return Integer.toString(i);
        }
    }
}
