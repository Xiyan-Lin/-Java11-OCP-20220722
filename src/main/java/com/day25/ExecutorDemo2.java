package com.day25;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo2 {
    public static void main(String[] args) {
        Runnable job1 = () -> System.out.println(new Random().nextInt(100));
        
        //ExecutorService service = Executors.newCachedThreadPool();
        ExecutorService service = Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++) {
            service.submit(job1);
            System.out.println("Thread count: " + Thread.activeCount());
        }
        service.shutdown();
    }
}
