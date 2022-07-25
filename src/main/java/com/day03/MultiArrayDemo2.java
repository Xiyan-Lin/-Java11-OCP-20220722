package com.day03;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        // 走訪一維陣列: for-loop
        int[] n = {100, 90, 80};
        for(int i=0 ; i<n.length ; i++) {
            System.out.println(n[i]);
        }
        // 走訪二維陣列: for-loop
        int[][] m = {{100, 90, 80}, {70, 60, 50}};
        for(int i=0 ; i<m.length ; i++) {
            System.out.println(m[i]); // m[i] 是一個一維陣列
            for(int k=0 ; k<m[i].length ; k++) {
                System.out.println(m[i][k]);
            }
        }
    }
}
