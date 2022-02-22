package com.programs;

public class SumMultiplesOfThreeAndFive{
    public void summultiply(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum Multiplies of 3 and 5 : "+sum);
    }

}
