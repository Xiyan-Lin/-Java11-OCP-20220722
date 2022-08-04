package com.day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("國文"); // String -> Object
        set.add(100); // int 會自動轉 Integer (auto-boxing) -> Object
        set.add("數學"); // String -> Object
        set.add(Integer.valueOf(90));// Integer -> Object
        set.add("英文"); // String -> Object
        //set.add(100); // 重複資料無法放入 Set 集合中
        set.add(70); // int 會自動轉 Integer (auto-boxing) -> Object
        set.add(null); // 放置 null
        System.out.println(set);
        // 使用 for/each(in) (會自動往下尋訪)
        for(Object obj : set) {
            System.out.println(obj);
        }
        // 使用 Iterator 走訪器 (會自動往下尋訪)
        Iterator iter = set.iterator();
        while (iter.hasNext()) { // 判斷使否有元素 ?
            Object obj = iter.next(); // 取得元素
            System.out.println(obj);
        }
        // 使用 java 8 foreach
        set.forEach(System.out::println);
    }
}
