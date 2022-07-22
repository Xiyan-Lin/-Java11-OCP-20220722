package com.day01;

/**
 * 一維陣列練習
 * @author MB-teacher
 * version: 1.0
 * date: 2022-07-22
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        System.out.println("一維陣列練習~");
        int[] scores = {100, 80, 90, 70, 50};
        System.out.printf("scores[0]: %d\n", scores[0]);
        System.out.printf("scores[1]: %d\n", scores[1]);
        System.out.printf("scores[2]: %d\n", scores[2]);
        System.out.println("修改 scores[2] = 65");
        scores[2] = 65;
        System.out.printf("scores[2]: %d\n", scores[2]);
    }
}
