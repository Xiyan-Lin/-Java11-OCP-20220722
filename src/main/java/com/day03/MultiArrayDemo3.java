package com.day03;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        // 走訪一維陣列: for-each(in)
        int[] n = {100, 90, 80};
        for(int x : n) {
            System.out.println(x);
        }
        
        // 走訪二維陣列: for-each(in)
        int[][] m = {{100, 90, 80}, {70, 60, 50}};
        for(int[] array : m) {
            System.out.println(array);
            for(int x : array) {
                System.out.println(x);
            }
        }
        
    }
}
