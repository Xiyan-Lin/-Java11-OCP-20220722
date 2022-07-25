package com.day02;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        // 變成 "Java OCP"
        sb.append(" ").append("OCP");  // append() 可以連續寫, 最左邊的 sb = 可以不用寫
        System.out.println(sb); // 相當於 sb.toString()
        // 原本 "Java OCP"
        // 位置  01234567
        // 變成 "Java 11 OCP"
        // 所以要在 5 的位置插入 "11 "
        sb.insert(5, "11 ");
        System.out.println(sb);
    }
}
