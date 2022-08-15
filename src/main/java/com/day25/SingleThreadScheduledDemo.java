package com.day25;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledDemo {
    public static void main(String[] args) throws Exception {
        // 得到 lotto 號碼的工作
        Callable<Integer> lotto = () -> new Random().nextInt(100);
        
        // 單次排程
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        
        // 3秒鐘之後執行取得 lotto 號碼程式
        ScheduledFuture<Integer> future = service.schedule(lotto, 3, TimeUnit.SECONDS);
        
        System.out.println("搖獎中...");
        int lottoNumber = future.get(); // 得到 lotto 號碼
        
        System.out.println("lotto 號碼: " + lottoNumber);
        
        service.shutdown(); // 服務關閉
        
    }
}
