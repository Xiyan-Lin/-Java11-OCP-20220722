package com.day01;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] scores = {90, 83, 100, 50, 70};
        // 求總分, 平均, 最高, 最低
        // 統計資料
        
        //IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        var stat = Arrays.stream(scores).summaryStatistics(); // var Java 11 開始支援
        System.out.println(stat);
        System.out.printf("總分: %d, 平均: %.1f, 最高: %d, 最低: %d\n", 
                          stat.getSum(), stat.getAverage(), stat.getMax(), stat.getMin());
    }
}
