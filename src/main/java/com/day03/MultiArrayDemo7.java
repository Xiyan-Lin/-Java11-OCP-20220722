package com.day03;

import java.util.Arrays;

public class MultiArrayDemo7 {
    public static void main(String[] args) {
        // 多維陣列分析
        // Integer.parseInt("100") 會得到 100 (將字串轉 int)
        Integer[][] m = {{100, null, 80}, {Integer.parseInt("70"), 60, null}, {50, null, null}};
        // null 表示缺考
        // 計算考試平均分數(排除缺考)
        // 使用 for-each(in)
        int sum = 0; // 總分
        int lens = 0; // 排除缺考的人數
        for(Integer[] array : m) {
            for(Integer x : array) {
                if(x != null) {
                    sum += x; // auto-unboxing, x.intValue()
                    lens++;
                }
            }
        }
        double avg = (double)sum / lens;
        System.out.println(avg);
        // 使用 Java Stream
        double avg2 = Arrays.stream(m)
              .flatMap(array -> Arrays.stream(array)) // {100, null, 80, Integer.parseInt("70"), 60, null, 50, null, null}  Integer 串流
              .filter(x -> x != null)                 // {100, 80, Integer.parseInt("70"), 60, 50}  Integer 串流
              .mapToInt(x -> x.intValue())            // {100, 80, 70, 60, 60} int 串流
              .average()  // 計算平均
              .getAsDouble();  // 取得平均內容值
        System.out.println(avg2);
        // 使用 Java Stream 利用 :: 簡化
        double avg3 = Arrays.stream(m)
                .flatMap(Arrays::stream)
                .filter(x -> x != null)
                .mapToInt(Integer::intValue)  // 相當於 x -> x.intValue()
                .average()  // 計算平均
                .getAsDouble();  // 取得平均內容值
        System.out.println(avg3);        
    }
}
