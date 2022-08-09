package com.day20;

import java.util.LinkedHashMap;
import java.util.Map;

public class SharedBall implements Runnable {
    private int i = 1000;
    private Map<String, Integer> map = new LinkedHashMap<>();
    
    @Override
    public void run() {
        while(pickUp()) {
            // do something....
        }
        // 印出 T1, T2 各拿了幾顆球
        System.out.println(map);
    }
    
    public synchronized boolean pickUp() {
        if(i <= 0) return false;
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 拿了第 %d 號球\n", tName, i);
        map.put(tName, map.getOrDefault(tName, 0) + 1);
        i = i - 1;
        return i > 0;
    }
    
}
