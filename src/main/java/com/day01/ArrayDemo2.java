package com.day01;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores = {100, 80, 90, 70, 50};
        // 走訪印出每一個元素內容 
        System.out.print(scores[0] + " ");
        System.out.print(scores[1] + " ");
        System.out.print(scores[2] + " ");
        System.out.print(scores[3] + " ");
        System.out.println(scores[4]);
        // 使用 for-loop part I
        for(int i=0;i<scores.length;i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        // 使用 for-loop part II
        for(int i=0, lens=scores.length ; i < lens ; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        // 使用 for-each(in) 不重視執行效率重視維護的狀況下使用
        for(int score : scores) {          // for(int i=0;i<scores.length;i++)
            System.out.print(score + " "); // System.out.print(scores[i] + " ");
        }
        System.out.println();
        // 不使用 for-loop 而使用 Arrays.stream() 串流
        Arrays.stream(scores).forEach(score -> System.out.print(score + " "));
        System.out.println();
        // 簡化使用 Arrays.stream() 串流, 雙冒號 :: 方法參考
        // 雙冒號 :: 方法參考, 漸少贅字程式碼, 讓程式碼一目了然(乾淨)
        Arrays.stream(scores).forEach(System.out::println); // score -> System.out.println(score)
        
    }
}
