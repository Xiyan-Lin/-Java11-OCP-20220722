package com.day17;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("A", 100);
        map.put("B", 90);
        map.put("C", 100);
        System.out.println(map);
        // 尋訪元素內容
        Enumeration<Integer> e = ((Hashtable)map).elements();
        while (e.hasMoreElements()) {
            Integer value = e.nextElement();
            System.out.println(value);
        }
        // 尋訪鍵值內容
        Enumeration<String> e2 = ((Hashtable)map).keys();
        while (e2.hasMoreElements()) {
            String key = e2.nextElement();
            System.out.println(key);
        }
        
    }
}
