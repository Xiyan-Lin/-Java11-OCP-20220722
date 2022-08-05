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
    }
}
