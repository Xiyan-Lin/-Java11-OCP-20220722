package com.day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        // 集合與泛型<>的應用
        // Java 7 以後若前後泛型一致, 後方的宣告可用 <> 表示(自動推斷)
        //Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(90);
        set.add(70);
        System.out.println(set);
        // 走訪器(Iterator)與泛型
        Iterator<Integer> iter = set.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer obj = iter.next();
            sum += obj;
        }
        System.out.println(sum);
        // for/each(in) 與泛型集合
        int sum2 = 0;
        for(Integer obj : set) {
            sum2 += obj;
        }
        System.out.println(sum2);
        // Java 8 stream 與泛型集合
        int sum3 = set.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum3);
        
    }
}
