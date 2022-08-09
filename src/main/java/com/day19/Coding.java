package com.day19;

public class Coding {
    public void job() {
        String tName = Thread.currentThread().getName(); // 取得執行緒名稱
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 在 Coding 第 %d 支程式\n", tName, i);
        }
    }
}
