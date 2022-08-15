package com.day25;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("普通任務");
    }
}

class LongTask implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("長任務開始");
        TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
        System.out.println("長任務結束");
        return null;
    }
}

public class ExecutorDemo3 {
    
}
