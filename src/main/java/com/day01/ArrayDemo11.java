package com.day01;

import java.util.Arrays;

public class ArrayDemo11 {
    public static void main(String[] args) {
        int[] scores = {90, 80, 100, 70}; // 4 筆
        // 再新增一筆分數 60 分
        int[] scores2 = Arrays.copyOf(scores, scores.length+1);
        System.out.println("scores2: " + Arrays.toString(scores2));
        scores2[scores2.length-1] = 60;
        System.out.println("scores2: " + Arrays.toString(scores2));
    }
}
