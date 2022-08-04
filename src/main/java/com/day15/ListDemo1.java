package com.day15;

import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // 資料可以重複,有順序姓
        // LinkedList透過Node節點的連結進行移動
        // 實作上會遍歷整個集合來找到指定位置
        List<Integer> list = new LinkedList();
        list.add(100);
        list.add(80);
        list.add(100);
        list.add(30); // Integer
        list.add(90);
        System.out.println(list); 
        System.out.println(list.get(1));
        list.set(1, 90); // 修改元素
        System.out.println(list.get(1));
        System.out.println(list); 
        list.remove(1); // 刪除元素
        System.out.println(list); 
        // 刪除 30 的元素 ?
        list.remove(Integer.valueOf(30));
        System.out.println(list); 
        
    }
}
