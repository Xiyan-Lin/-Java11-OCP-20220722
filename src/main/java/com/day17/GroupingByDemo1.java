package com.day17;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.Arrays.asList;
import java.util.LinkedHashMap;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.function.Function.identity;

public class GroupingByDemo1 {
    public static void main(String[] args) {
        // groupingBy 資料分組
        List<String> items = asList("apple", "banana", "apple", "apple", "orange", "banana", "papaya");
        Map<String, Long> result = items.stream()
                                        .collect(groupingBy(identity(), counting()));
        System.out.println(result); // {papaya=1, orange=1, banana=2, apple=3}
        // 加入排序
        // 排序前: {papaya=1, orange=1, banana=2, apple=3}
        // 排序後: {apple=3, banana=2, papaya=1, orange=1}
        result.entrySet()
              .stream()
              .sorted(Entry.<String, Long>comparingByValue().reversed())
              .forEachOrdered(e -> System.out.println(e));
        
        // 將排序後的結果放到 Map<String, Long> finalMap = new LinkedHashMap() 中
        Map<String, Long> finalMap = new LinkedHashMap();
        result.entrySet()
              .stream()
              .sorted(Entry.<String, Long>comparingByValue().reversed())
              .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);
                
    }
}
