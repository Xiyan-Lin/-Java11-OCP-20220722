package com.day01;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] scores = {90, 83, 100, 50, 70};
        // 求最高分(max) = ?
        int max = 0;
        for(int i=0 ; i < scores.length ; i++) {
            if(scores[i] > max) {
                max = scores[i];  // max 的內容換成 scores[i]
            }
        }
        System.out.printf("最大值: %d\n", max);
        // 求最低分(min) = ?
        int min = Integer.MAX_VALUE;
        for(int score : scores) {
            if(score < min) {
                min = score;
            }
        }
        System.out.printf("最小值: %d\n", min);
    }
}
