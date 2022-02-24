package com.programs;

public class ReverseString {
    public static String reverse(String s){
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            st += s.charAt(s.length() - i - 1);
        }
        return st;
    }
}
