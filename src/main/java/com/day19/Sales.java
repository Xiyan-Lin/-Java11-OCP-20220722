package com.day19;

public class Sales extends Thread {
    
    @Override
    public void run() {
        job();
    }
    
    public void job() {
        String tName = Thread.currentThread().getName(); // 取得執行緒名稱
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 在 Sales 第 %d 個客戶\n", tName, i);
        }
    }
}
