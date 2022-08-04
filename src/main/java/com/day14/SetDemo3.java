package com.day14;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("國文");
        set.add(100);
        set.add("數學");
        set.add(90);
        set.add("英文");
        set.add(70);
        set.add(null); // 放置 null
        System.out.println(set);
        // 過濾出是 Integer 元素的資料並計算總合
        // 來源: [null, 100, 國文, 英文, 70, 90, 數學]
        // 過濾結果: [100, 70, 90] 
        int sum = 0;
        System.out.print("[");
        for(Object obj : set) {
            if(obj instanceof Integer) {
                sum += (Integer)obj;
                System.out.print(obj + ", ");
            }
        }
        System.out.println("]");
        System.out.println(sum);
        // 使用 Java 8 stream
        int sum2 = set.stream()
                      .filter(obj -> obj instanceof Integer)
                      // Object obj -> obj.toString() -> int
                      .mapToInt(obj -> Integer.parseInt(obj.toString()))
                      .sum();
        System.out.println(sum2);
        
    }
}
