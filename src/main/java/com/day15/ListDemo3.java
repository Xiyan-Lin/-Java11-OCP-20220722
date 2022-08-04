package com.day15;

import java.util.Stack;

public class ListDemo3 {
    public static void main(String[] args) {
        // 堆疊 Stack 先進後出/後進先出
        Stack<String> stack = new Stack<>();
        stack.push("C");
        stack.push("B");
        stack.push("A");
        System.out.println(stack);
        while (!stack.isEmpty()) {            
            System.out.println(stack.pop());
        }
        System.out.println(stack);
        
    }
}
