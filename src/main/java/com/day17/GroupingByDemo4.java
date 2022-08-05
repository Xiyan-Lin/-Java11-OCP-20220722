package com.day17;

// 樂透號碼分類

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class GroupingByDemo4 {
    public static void main(String[] args) {
        List<Set<Integer>> lottos = getLottos(10); // 取得幾注的 539 號碼
        System.out.println(lottos);
    }
    
    public static List<Set<Integer>> getLottos(int amount) {
        Random random = new Random();
        List<Set<Integer>> lottos = new ArrayList<>(); // 存放每一注的樂透資料
        IntStream.range(0, amount).forEach(i -> {
            Set<Integer> lotto = new LinkedHashSet<>(); // 每一注 (539)
            while(lotto.size() < 5) {
                int n = random.nextInt(39) + 1;
                lotto.add(n);
            }
            lottos.add(lotto);
        });
        return lottos;
    }
}
