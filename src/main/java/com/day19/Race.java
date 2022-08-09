package com.day19;

public class Race implements Runnable {
    
    @Override
    public void run() {
        String tName = Thread.currentThread().getName(); // 取得執行緒名稱
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tName, i);
        }
    }
    
}
