package com.day25;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRateDemo {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.print("begin: " + new Date());
            int n = new Random().nextInt(5000);
            try {
                Thread.sleep(n);
            } catch (Exception e) {
            }
            System.out.print(" n=" + n);
            System.out.println(" end: " + new Date());
        };
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(job, 1, 3, TimeUnit.SECONDS); // 工作, 初始delay(1秒), delay頻率(3秒), 時間單位
        
    }
}
