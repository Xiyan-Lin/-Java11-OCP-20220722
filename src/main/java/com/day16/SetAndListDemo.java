package com.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;
import java.util.function.ToDoubleFunction;

public class SetAndListDemo {
    // 複合集合 List<Set<Integer>>
    public static void main(String[] args) {
        // 1. 建立 Set<Integer>
        Set<Integer> lotto1 = getLottoSet();
        Set<Integer> lotto2 = getLottoSet();
        Set<Integer> lotto3 = getLottoSet();
        // 2. 建立 List<Set<Integer>>
        // 經過定義之後仍可自由變更數量
        /*
        List<Set<Integer>> lottos = new ArrayList<>();
        lottos.add(lotto1);
        lottos.add(lotto2);
        lottos.add(lotto3);
        */
        // 一經過定義之後不可再變更數量
        List<Set<Integer>> lottos = Arrays.asList(lotto1, lotto2, lotto3);
        // 請問有幾注 ?
        System.out.printf("注數: %d\n", lottos.size());
        // 列出每一注資料
        lottos.stream()
              .forEach(System.out::println);
        // 列出每一注平均數值 I
        lottos.stream()
              .mapToDouble(lotto -> lotto.stream().mapToInt(Integer::intValue).average().getAsDouble())
              .forEach(System.out::println);
        // 列出每一注平均數值 II
        ToDoubleFunction<Set<Integer>> lottoAvg = lotto -> lotto.stream().mapToInt(Integer::intValue).average().getAsDouble();
        lottos.stream()
              .mapToDouble(lottoAvg)
              .forEach(System.out::println);  
        
    }
    
    private static Set getLottoSet() {
        Random random = new Random();
        Set<Integer> lotto = new LinkedHashSet<>();
        while (lotto.size() < 5) {            
            lotto.add(random.nextInt(39) + 1); // 1~39
        }
        return lotto;
    }
}
