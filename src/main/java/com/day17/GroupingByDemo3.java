package com.day17;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.toSet;

public class GroupingByDemo3 {
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
        // 根據 price 來分類
        Map<Double, List<Fruit>> groupByPriceMap = fruits.stream()
                   .collect(groupingBy(Fruit::getPrice));
        System.out.println(groupByPriceMap);
        // 根據 price 來分類去除重複資料
        Map<Double, Set<String>> groupByPriceMap2 = fruits.stream()
                   .collect(groupingBy(Fruit::getPrice, mapping(Fruit::getName, toSet())));
        System.out.println(groupByPriceMap2);
    }
}
