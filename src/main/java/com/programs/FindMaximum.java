package com.programs;

public class FindMaximum {
    public void maximum(int[]list){
        for (int i=0;i<list.length-1;i++){
            if(list[i]>list[i+1]){
                int help=list[i];
                list[i]=list[i+1];
                list[i+1]=help;
            }
        }
        System.out.println("Maximum Number : "+list[list.length-1]);
    }
}
