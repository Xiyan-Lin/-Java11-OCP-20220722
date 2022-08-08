package com.day18;

import java.util.Scanner;

public class ExceptionDemo4 {
    // 任何 RuntimeException 的發生
    // 建議應使用 Java code 進行驗證與保護而非一昧使用 try-catch
    public static void main(String[] args) {
        int x = 10; // 分子
        System.out.print("分子固定是10, 請輸入一個數字當分母: ");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt(); // 得到使用者所輸入的內容
        // 檢查 y 是否 = 0 ?
        if(y == 0) {
            System.out.println("分母不可 = 0");
            return; // 當下所執行的方法強制提前結束
        }
        // 計算結果
        int result = x / y;
        System.out.println("計算結果: " + result);
    }
}
