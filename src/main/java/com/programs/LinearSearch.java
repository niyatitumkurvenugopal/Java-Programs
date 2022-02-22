package com.programs;

import java.util.Objects;

public class LinearSearch {
    public void search(int n,int[]arr){
        int index=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(Objects.equals(arr[i], n)){
                index=i;
                break;
            }
        }
        System.out.println("Linear Search : "+index);
    }
}
