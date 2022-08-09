package com.day20;

public class SharedBall implements Runnable {
    private int i = 10;
    
    @Override
    public void run() {
        while(pickUp()) {
            // do something....
        }
    }
    
    public boolean pickUp() {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 拿了第 %d 號球\n", tName, i);
        i = i - 1;
        return i == 0;
    }
    
}
