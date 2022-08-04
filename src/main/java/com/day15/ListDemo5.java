package com.day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo5 {
    public static void main(String[] args) {
        // LinkedList透過Node節點的連結進行移動
        // 實作上會遍歷整個集合來找到指定位置
        // 若要頻繁新增刪除時效率較 ArrayList 佳
        List<Integer> list1 = new LinkedList<>();
        
        // ArrayList 隨機存取陣列
        // 實作上透過index就可以找到該元素的記憶體位置
        List<Integer> list2 = new ArrayList<>();
        
        // 支援多執行緒的集合(Thread-safe)
        Vector<Integer> list3 = new Vector<>();
        for(int i=0;i<10;i++) {
            list3.add(i);
        }
        System.out.printf("capacity(空間): %d\n" , list3.capacity());
        System.out.printf("size(已使用): %d\n" , list3.size());
    }
}
