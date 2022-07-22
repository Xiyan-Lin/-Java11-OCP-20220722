package com.day01;

import java.util.Arrays;

public class ArrayDemo12 {
    public static void main(String[] args) {
        int[] scores = {90, 50, 100, 40}; // 4 筆
        // 刪除第一筆資料
        int[] scores2 = Arrays.copyOfRange(scores, 1, scores.length);
        System.out.println("scores2: " + Arrays.toString(scores2));
        
        
    }
}
