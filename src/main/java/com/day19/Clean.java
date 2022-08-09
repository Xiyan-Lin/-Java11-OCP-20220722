package com.day19;

public class Clean {
    public void job() {
        String tName = Thread.currentThread().getName(); // 取得執行緒名稱
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 在 Clean 第 %d 個房間\n", tName, i);
        }
    }
}
