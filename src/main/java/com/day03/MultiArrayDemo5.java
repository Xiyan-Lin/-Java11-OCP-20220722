package com.day03;

import java.util.Random;
import java.util.Arrays;

public class MultiArrayDemo5 {
    public static void main(String[] args) {
        // 利用 Arrays.toString() 將陣列內容串格式印出
        // 通常用於觀察一維陣列內部元素資料用
        Random random = new Random();
        int[] n = {
            random.nextInt(100), random.nextInt(100), random.nextInt(100)
        };
        System.out.println("n: " + Arrays.toString(n));
        int[][] m = new int[2][];
        m[0] = new int[]{random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        m[1] = new int[]{random.nextInt(10), random.nextInt(10)};
        System.out.println("m: " + Arrays.toString(m));
        for(int[] array : m) {
            System.out.println(Arrays.toString(array));
        }
        Arrays.stream(m)
              .forEach(array -> System.out.println(Arrays.toString(array)));
        
    }
}
