package com.programs;

import java.util.Comparator;
import java.util.List;

public class FindMaximumStream {
    public static int getLargestNumberStream(List<Integer> list){
        return list.stream()
                .max(Comparator.naturalOrder())
                .get();

    }
}
