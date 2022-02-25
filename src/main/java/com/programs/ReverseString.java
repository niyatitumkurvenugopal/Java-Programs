package com.programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static String reverse(String s){
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            st += s.charAt(s.length() - i - 1);
        }
        return st;
    }

    public static String reverseStream(String str){
        return Stream.of(str)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        }
}


