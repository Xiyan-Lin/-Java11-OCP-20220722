package com.day15;

import java.util.LinkedList;
import java.util.Queue;

public class ListDemo2 {
    public static void main(String[] args) {
        // 佇列 Queue 先進先出
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);
        /*
        System.out.println(queue.poll()); // 取得元素
        System.out.println(queue);
        System.out.println(queue.poll()); // 取得元素
        System.out.println(queue);
        System.out.println(queue.poll()); // 取得元素
        System.out.println(queue);
        System.out.println(queue.poll()); // 取得元素
        System.out.println(queue);
        */
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // 取得元素
        }
        System.out.println(queue);
        
    }
}
