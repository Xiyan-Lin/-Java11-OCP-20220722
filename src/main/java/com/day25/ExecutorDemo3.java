package com.day25;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new Task());
        // 下達了平滑關閉指令(會等待所有工作任務都結束之後才會關閉)
        service.shutdown(); // service.shutdownNow(); // 強制關閉(不會等待所有工作任務是否都結束)
        
        
        // 偵測執行緒池是否有關閉 ?
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.out.println("執行緒池尚未關閉");
        }
        System.out.println("執行緒池已關閉");
    }
}
