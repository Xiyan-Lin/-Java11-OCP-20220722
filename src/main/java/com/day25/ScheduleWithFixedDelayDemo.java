package com.day25;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleWithFixedDelayDemo {
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
        //                             工作, 初始delay, 每次delay
        service.scheduleWithFixedDelay(job, 1, 2, TimeUnit.SECONDS);
        
    }
}
