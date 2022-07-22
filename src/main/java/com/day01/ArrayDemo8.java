package com.day01;

import java.util.Arrays;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[] scoresA = {90, 83, 100, 85, 70}; // A 班成績
        int[] scoresB = {45, 46, 20, 100, 100}; // B 班成績
        // 求 A, B 哪一個班級分數比較集中
        double avgA = Arrays.stream(scoresA).average().getAsDouble();
        double sumA = 0;
        for(int score : scoresA) {
            sumA += Math.pow(score - avgA, 2);  // pow 指數
        }
        double sdA = Math.sqrt(sumA / scoresA.length); // sqrt 開根號
        System.out.printf("A 班標準差: %.1f\n", sdA);
        //-----------------------------------------------------------
        double avgB = Arrays.stream(scoresB).average().getAsDouble();
        double sumB = Arrays.stream(scoresB).mapToDouble(score -> Math.pow(score - avgB, 2)).sum();
        double sdB = Math.sqrt(sumB / scoresB.length);
        System.out.printf("B 班標準差: %.1f\n", sdB);
    }
}
