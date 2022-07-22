package com.day01;

import java.util.Arrays;

public class ArrayDemo13 {
    public static void main(String[] args) {
        int[] scores = {90, 50, 100, 40}; // 4 筆
        // 新加上 60 的分數, 再刪除第一筆資料
        // [50, 100, 40, 60]
        int[] scores2 = Arrays.copyOf(scores, scores.length + 1);
        scores2[scores2.length - 1] = 60;
        scores2 = Arrays.copyOfRange(scores2, 1, scores2.length);
        System.out.println("scores2: " + Arrays.toString(scores2));
        
    }
}
