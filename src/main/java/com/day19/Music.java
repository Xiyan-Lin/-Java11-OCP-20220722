package com.day19;

public class Music extends Thread {
    
    @Override
    public void run() {
        job();
    }
    
    public void job() {
        String tName = Thread.currentThread().getName(); // 取得執行緒名稱
        for(int i=1;i<=1000_0000;i++) {
            System.out.printf("%s 在 Music 播放第 %d 首歌\n", tName, i);
        }
    }
}
