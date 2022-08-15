package com.day25;

import java.util.Random;
import java.util.concurrent.Executor;

public class ExecutorDemo1 {
    public static void main(String[] args) {
        // 工作
        Runnable job1 = () -> System.out.println(new Random().nextInt(10));
        Runnable job2 = () -> System.out.println(new Random().nextInt(1000));
        
        // 建立執行環境
        Executor exec = (job) -> new Thread(job).start();
        
        // 執行工作
        exec.execute(job1);
        exec.execute(job2);
    }
}
