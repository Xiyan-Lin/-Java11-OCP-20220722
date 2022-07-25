package com.day03;

import java.util.Arrays;
import java.util.function.Predicate;

public class MultiArrayDemo6 {
    public static void main(String[] args) {
        // 多維陣列分析
        // Integer.parseInt("100") 會得到 100 (將字串轉 int)
        Integer[][] m = {{100, null, 80}, {Integer.parseInt("70"), 60, null}, {50, null, null}};
        // null 表示缺考
        // 印出所有考試分數(排除缺考)
        // 使用 for-each(in)
        for(Integer[] array : m) {
            for(Integer x : array) {
                if(x != null) {
                    System.out.println(x);
                }
            }
        }
        // 使用 Java 8 Stream
        Arrays.stream(m)
              .flatMap(array -> Arrays.stream(array))
              .filter(x -> x != null)
              .forEach(x -> System.out.println(x));
        // 使用 Java 8 Stream 簡化版(利用方法參考符 ::)
        Predicate<Integer> notNull = x -> x != null;
        Predicate<Integer> notNullAndMoreThan60 = x -> x != null && x > 60;
        Predicate<Integer> moreThan60 = x -> x > 60;
        Arrays.stream(m)
              .flatMap(Arrays::stream)
              //.filter(x -> x != null)
              //.filter(notNullAndMoreThan60)
              .filter(notNull)
              .filter(moreThan60)  
              .forEach(System.out::println);
    }
}
