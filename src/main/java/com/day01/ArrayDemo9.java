package com.day01;
import java.util.Arrays;
public class ArrayDemo9 {
    public static void main(String[] args) {
        // 建立陣列的幾種方法
        int[] x = new int[3]; // [0, 0, 0]
        System.out.println("x = " + Arrays.toString(x));
        x[0] = 100;
        x[1] = 80;
        x[2] = 90;
        System.out.println("x = " + Arrays.toString(x));
        int[] y = new int[]{40, 50, 60}; // 有初始值的陣列
        int[] z = {10, 20, 30}; // 有初始值的陣列
        System.out.println("y = " + Arrays.toString(y));
        System.out.println("z = " + Arrays.toString(z));
    }
}
