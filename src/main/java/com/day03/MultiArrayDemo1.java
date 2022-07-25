package com.day03;

public class MultiArrayDemo1 {
    public static void main(String[] args) {
        // 一維陣列
        int[] n = {100, 90, 80};
        int[] n2 = {70, 60, 50};
        int[] n3 = null;
        // 多維陣列
        int[][] m = {{100, 90, 80}, {70, 60, 50}};
        int[][] p = {n, {70, 60, 50}};
        int[][] q = {n, n2};
        String[][] r = {{"A", "BB", "CCC"}, {"D", "EE", "FFF"}};
        
        // 直接印出陣列物件
        // [ 表示一維陣列
        // [[ 表示二維陣列
        // L 表示一個物件對象
        System.out.println("n: " + n);
        System.out.println("n3: " + n3);
        System.out.println("m: " + m);
        System.out.println("r: " + r);
        
        
    }
}
