package com.day19;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Thread.sleep(3000);
        return random.nextInt(100);
    }
    
}
