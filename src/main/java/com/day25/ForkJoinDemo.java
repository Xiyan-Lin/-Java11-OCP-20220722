package com.day25;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinDemo {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // forkjoin
        ForkJoinTask<Integer> task = new SumTask(array, 0, array.length);
        // start time
        long startTime = System.currentTimeMillis();
        // 執行
        int total = ForkJoinPool.commonPool().invoke(task);
        // end time 
        long endTime = System.currentTimeMillis();
        System.out.printf("ForkJoin total: %d time: %d ms\n", total, (endTime - startTime));
    }
}
