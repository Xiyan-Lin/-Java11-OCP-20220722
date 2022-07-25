package com.day03;

import java.util.Arrays;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        // 走訪一維陣列: Java 8 Stream 利用 Arrays.stream()
        int[] n = {100, 90, 80};
        Arrays.stream(n).forEach(x -> System.out.println(x));
        
        // 走訪二維陣列: Java 8 Stream 利用 Arrays.stream()
        int[][] m = {{100, 90, 80}, {70, 60, 50}};
        Arrays.stream(m).forEach(x -> System.out.println(x));
    }
}
