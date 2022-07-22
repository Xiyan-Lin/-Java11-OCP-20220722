package com.day01;

import java.util.Arrays;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[] scores = {90, 80, 100, 70}; // 4 筆
        // 再新增一筆分數 60 分
        int[] scores2 = new int[scores.length+1];  // 5 筆 [0, 0, 0, 0, 0]
        System.out.println("scores2: " + Arrays.toString(scores2));
        // 將 scores 的資料倒入倒 scores2 變成 [90, 80, 100, 70, 0]
        // 最後將 60 放到最後一個元素中, 結果變成 [90, 80, 100, 70, 60]
        for(int i=0 ; i < scores.length ; i++) {
            scores2[i] = scores[i];
        }
        System.out.println("scores2: " + Arrays.toString(scores2));
        scores2[scores2.length-1] = 60;
        System.out.println("scores2: " + Arrays.toString(scores2));
    }
}
