package com.day17;

// 樂透號碼分類

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class GroupingByDemo4 {
    public static void main(String[] args) {
        List<Set<Integer>> lottos = getLottos(10); // 取得幾注的 539 號碼
        System.out.println(lottos);
        // 每一個號碼出現過幾次?
        // 1. 將所有號碼匯集在一起
        List<Integer> nums = lottos.stream().flatMap(lotto -> lotto.stream()).collect(toList());
        System.out.println(nums);
        
        // 2. 利用 groupingBy 實現每一個號碼出現過幾次?
        // 例如 {2=5, 4=2 ...} 解讀: 2號出現5次, 4號出現2次
        Map<Integer, Long> result = nums.stream().collect(groupingBy(identity(), counting()));
        System.out.println(result);
        
        // 3. 根據出現次數多寡排序
        
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
