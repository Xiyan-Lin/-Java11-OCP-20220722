package com.day17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
    }
}
