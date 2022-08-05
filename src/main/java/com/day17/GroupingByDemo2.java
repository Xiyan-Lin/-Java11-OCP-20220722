package com.day17;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;
import static java.util.function.Function.identity;

public class GroupingByDemo2 {
    public static void main(String[] args) {
        List<Fruit> fruits = asList(
                new Fruit("apple", 10, 9.99),
                new Fruit("banana", 20, 19.99),
                new Fruit("orange", 10, 29.99),
                new Fruit("watermelon", 10, 29.99),
                new Fruit("papaya", 20, 9.99),
                new Fruit("apple", 10, 9.99),
                new Fruit("banana", 10, 19.99),
                new Fruit("apple", 20, 9.99)
        );
        // 每種水果各有幾箱 ?
        Map<String, Long> counting = fruits.stream()
                .collect(groupingBy(Fruit::getName, counting()));
        System.out.println(counting);
        
        // 每種水果各有幾顆 ?
        Map<String, Integer> sum = fruits.stream()
                .collect(groupingBy(Fruit::getName, summingInt(Fruit::getQty)));
        System.out.println(sum);
        
        // 每種水果各有幾顆並由大(數量多)到小(數量少)排序 ?
        
    }
}
