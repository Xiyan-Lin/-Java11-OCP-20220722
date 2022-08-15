package com.day25;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer>{
    // 門檻值
    static final int THRESHOLD = 3;
    // 任務數組
    int[] array;
    // 起迄未至
    int start, end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected Integer compute() {
        // 1. 判斷任務是否達到門檻值 ?
        if(end - start <= THRESHOLD) {
            int sum = 0;
            for(int i=start;i<end;i++) {
                sum += this.array[i];
            }
            return sum;
        }
        // 2. 任務一分為二
        int middle = (end - start) / 2;
        System.out.printf("拆分 %d~%d ==> %d~%d, %d~%d\n", start, end, start, middle, middle, end);
        // 3. 分裂任務
        SumTask subTask1 = new SumTask(array, start, middle);
        SumTask subTask2 = new SumTask(array, middle, end);
        // 4. 任務運行
        invokeAll(subTask1, subTask2);
        // 5. 獲得子任務結果
        int result1 = subTask1.join();
        int result2 = subTask2.join();
        // 6. 匯總結果
        int total = result1 + result2;
        System.out.printf("result1: %d, result2: %d\n", result1, result2);
        return total;
        
    }
    
}
