package com.day01;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {100, 83, 90, 70, 50};
        // 分析使用 for-loop
        // 總分 = ? , 平均 = ?
        int lens = scores.length;  // 陣列長度
        int sum = 0; // 累績所有分數
        for(int i=0 ; i < lens ; i++) {
            sum = sum + scores[i];  // 累加
        }
        System.out.printf("總分: %d\n", sum);
        double avg = (double)sum / lens;
        System.out.printf("平均: %.1f\n", avg);
    }
}
