package com.programs;

public class FizzBuzz {
    public void fizzbuzz(int i){
        if(i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
        }
        if(i%3==0){
            System.out.println("Fizz");
        }
        if(i%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
    }
}
