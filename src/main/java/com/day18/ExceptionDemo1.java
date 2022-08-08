package com.day18;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int x = 10; // 分子
        System.out.print("分子固定是10, 請輸入一個數字當分母: ");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt(); // 得到使用者所輸入的內容
        // 計算結果
        int result = x / y;
        System.out.println("計算結果: " + result);
    }
}
