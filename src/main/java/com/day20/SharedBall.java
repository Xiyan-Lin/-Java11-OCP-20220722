package com.day20;

public class SharedBall implements Runnable {
    private int i = 10;
    
    @Override
    public void run() {
        while(pickUp()) {
            // do something....
        }
    }
    
    public synchronized boolean pickUp() {
        if(i <= 0) return true;
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 拿了第 %d 號球\n", tName, i);
        i = i - 1;
        return i > 0;
    }
    
}
