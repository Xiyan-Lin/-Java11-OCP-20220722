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
    }
}
