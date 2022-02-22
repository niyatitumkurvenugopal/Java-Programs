package com.programs;

public class ReverseString {
    public void reverse(String s){
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            st += s.charAt(s.length() - i - 1);
        }
        System.out.println("Reverse String : "+st);
    }
}
