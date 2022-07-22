package com.day01;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = {100, 83, 90, 70, 50};
        // 分析 for-each(in) Java 1.4 開始支援
        // 計算總分與平均
        int sum = 0;  // 紀錄總分
        for(int score : scores) {
            sum += score; // sum = sum + score;
        }
        double avg = (double)sum/scores.length;
        System.out.printf("總分: %d\n", sum);
        System.out.printf("平均: %.1f\n", avg);
    }
}
