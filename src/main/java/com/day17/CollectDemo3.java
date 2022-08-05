package com.day17;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.summingInt;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class CollectDemo3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jo", "Mary", "Helen");
        // joining 連結成一個字串
        // 例如: "JohnJoMaryHelen" 或 "John Jo Mary Helen" 或 "John, Jo, Mary, Helen"
        String result1 = names.stream().collect(joining());
        System.out.println(result1);
        String result2 = names.stream().collect(joining(" "));
        System.out.println(result2);
        String result3 = names.stream().collect(joining(", "));
        System.out.println(result3);
        String result4 = names.stream().collect(joining(", ", "begin-", "-end"));
        System.out.println(result4);
        // counting() 對元素進行計數, 並將結果以 long 值回傳
        long count = names.stream().collect(counting());
        System.out.println(count);
        // summarizeInt() 對所有元素進行加總
        // 例如: 計算每一個名字的長度並加總
        // summingInt 會回傳一個數值
        // summarizingInt 會回傳一個統計物件
        int summarize = names.stream().collect(summingInt(String::length));
        System.out.println(summarize);
        
        IntSummaryStatistics stat = names.stream().collect(summarizingInt(String::length));
        System.out.println(stat);
    }
}
