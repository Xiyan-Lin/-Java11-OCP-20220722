package com.day02;

import java.util.Arrays;

public class StringAndChar {
    public static void main(String[] args) {
        // 建立 char[] 字元陣列
        char[] charArray = {'J', 'a', 'v', 'a'};
        System.out.println("charArray: " + Arrays.toString(charArray));
        // 將 char[] 轉 String
        String s1 = new String(charArray);  // 建立字串 I (透過 char[])
        System.out.println("s1: " + s1);
        String s2 = new String("Java"); // 建立字串 II
        String s3 = "Java"; // 建立字串 III (字面值(Literal value)宣告)
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
    }
}
