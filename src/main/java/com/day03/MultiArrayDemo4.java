package com.day03;

import java.util.Arrays;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        // 走訪一維陣列: Java 8 Stream 利用 Arrays.stream()
        int[] n = {100, 90, 80};
        Arrays.stream(n).forEach(x -> System.out.println(x));
        
        // 走訪二維陣列: Java 8 Stream 利用 Arrays.stream()
        int[][] m = {{100, 90, 80}, {70, 60, 50}};
        //Arrays.stream(m).forEach(array -> System.out.println(array));
        // array 是一維陣列
        Arrays.stream(m).forEach(array -> Arrays.stream(array).forEach(x -> System.out.println(x)));
        // 利用 flat
        Arrays.stream(m) // 二維陣列串流
              .flatMapToInt(array -> Arrays.stream(array))  // 打平(flat)轉換(Map)成一維陣列串流
              .forEach(x -> System.out.println(x)); // 將串流內的元素依序印出
    }
}
