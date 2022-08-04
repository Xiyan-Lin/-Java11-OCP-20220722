package com.day14;

import java.util.HashSet;
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
        // 使用 for/each(in)
        for(Object obj : set) {
            System.out.println(obj);
        }
        
    }
}
