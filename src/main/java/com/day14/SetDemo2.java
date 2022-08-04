package com.day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {
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
        // 想要把 null 元素移除
        // 利用 Iterator 中的 remove() 方法來達成
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            if (obj == null) {
                iter.remove(); // 移除元素
            }
        }
        System.out.println(set);
        // 想要把 String 元素移除
        iter = set.iterator(); // 重新取得 iterator 物件
        while (iter.hasNext()) {
            Object obj = iter.next();
            if(obj instanceof String) {
                iter.remove();
            }
        }
        System.out.println(set);
        // 計算總分
        int sum = 0;
        iter = set.iterator(); // 重新取得 iterator 物件
        while (iter.hasNext()) {
            Object obj = iter.next();
            if (obj instanceof Integer) {
                // 1. obj 轉為 Integer 物件
                // 2. 並透過 unboxing 轉為 int 再給 sum 進行累加
                sum += (Integer)obj; 
            }
        }
        System.out.println(sum);
    }
}
