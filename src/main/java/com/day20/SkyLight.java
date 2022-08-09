package com.day20;

import java.util.concurrent.CyclicBarrier;
import java.util.Random;

public class SkyLight extends Thread {
    private CyclicBarrier cyclicBarrier;
    
    public SkyLight(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
    
    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 出發了\n", tName);
        // 模擬乘車時間
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(5000));
            System.out.printf("%s 到了\n", tName);
            cyclicBarrier.await(); // 等待其他人
        } catch (Exception e) {
        }
        // 回家
        System.out.printf("%s 返程結束美好的一天\n", tName);
        
    }
    
    
}
