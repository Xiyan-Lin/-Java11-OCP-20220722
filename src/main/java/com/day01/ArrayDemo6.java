package com.day01;

import java.util.Arrays;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] scores = {90, 83, 100, 50, 70};
        // 求總分, 平均, 最高, 最低
        int sum = Arrays.stream(scores).sum();
        double avg = Arrays.stream(scores).average().getAsDouble();
        int max = Arrays.stream(scores).max().getAsInt();
        int min = Arrays.stream(scores).min().getAsInt();
        System.out.printf("總分: %d, 平均: %.1f, 最高: %d, 最低: %d\n", sum, avg, max, min);
    }
}
