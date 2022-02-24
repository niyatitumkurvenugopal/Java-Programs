package com.programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringStream {
    public static String reverseStream(String str){
        return Stream.of(str)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}
