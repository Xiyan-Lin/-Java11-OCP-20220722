package com.day17;

import java.util.List;
import java.util.Map;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;
import static java.util.function.Function.identity;

public class GroupingByDemo1 {
    public static void main(String[] args) {
        // groupingBy 資料分組
        List<String> items = asList("apple", "banana", "apple", "apple", "orange", "banana", "papaya");
        Map<String, Long> result = items.stream()
                                        .collect(groupingBy(identity(), counting()));
        System.out.println(result);
    }
}
