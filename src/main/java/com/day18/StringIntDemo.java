package com.day18;

public class StringIntDemo {
    public static void main(String[] args) {
        // 如何檢查字串內的資料都是數字 ?
        // [0-9]+ 任意1~多個(+) 0~9 的資料
        String numStr = "40";
        System.out.println(numStr.matches("[0-9]+"));
    }
}
