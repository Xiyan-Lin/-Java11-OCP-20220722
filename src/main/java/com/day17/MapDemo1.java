package com.day17;

import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();// new HashMap<>();
        map.put("甲", 100);
        map.put("乙", 90);
        map.put("丙", 100);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("甲"));
        System.out.println(map.get("丁"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        // 指定的key值是否存在 ?
        if(map.containsKey("丁")) {
            System.out.println("key 丁 存在, value = " + map.get("丁"));
        } else {
            System.out.println("key 丁 不存在");
        }
        // 指定的value值是否存在 ?
        if(map.containsValue(90)) {
            System.out.println("value 90 存在");
        } else {
            System.out.println("value 90 不存在");
        }
        // 1. 透過 keySet() + for/each(in) 來計算總分
        // 透過 keySet() 的到 [甲, 乙, 丙]
        // 再透過 map.get(Key) 得到每一個 Key 的 Value
        Set<String> keys = map.keySet();
        int sum = 0;
        for(String key : keys) {
            System.out.printf("key: %s value: %d\n", key, map.get(key));
            sum += map.get(key);
        }
        System.out.println(sum);
        // 2. 透過 values() + stream() 來計算總分
        int sum2 = map.values() // 得到 Collection 物件
                      .stream() // 調用 stream() 方法 (Java 8 以後每一個 Collection 物件一定都有 stream() 方法)
                      .mapToInt(Integer::intValue)
                      .sum();
        System.out.println(sum2);
        // 3. 透過 entrySet() + stream() 來計算總分
        int sum3 = map.entrySet()
                      .stream()
                      //.mapToInt(e -> e.getValue().intValue())
                      //.mapToInt(e -> e.getValue()) // auto-unboxing
                      .mapToInt(Entry::getValue)
                      .sum();
        System.out.println(sum3);
        // 4. 請問 value = 100 有哪些 key ?
        map.entrySet()
           .stream()
           //.filter(e -> e.getValue().intValue() == 100)
           .filter(e -> e.getValue() == 100)
           //.map(e -> e.getKey())
           .map(Entry::getKey)
           .forEach(System.out::println);
        
        // 5. 請問 value = 100 有哪些 key 並存放到集合中?
        Set<String> names = map.entrySet()
                               .stream()
                               .filter(e -> e.getValue() == 100)
                               .map(Entry::getKey)
                               .collect(Collectors.toSet());
        System.out.println(names);
    }
}
