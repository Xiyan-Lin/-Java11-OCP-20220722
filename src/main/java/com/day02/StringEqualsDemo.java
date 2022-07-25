package com.day02;

public class StringEqualsDemo {
    public static void main(String[] args) {
        // 字串在 == 與 equals() 間的比較差異
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        String s5 = "jAvA";
        System.out.printf("s1 == s2: %b\n", s1 == s2);
        System.out.printf("s1.equals(s2): %b\n", s1.equals(s2));
        System.out.printf("s3 == s4: %b\n", s3 == s4);
        System.out.printf("s3.equals(s4): %b\n", s3.equals(s4));
        System.out.printf("s1.equals(s4): %b\n", s1.equals(s4));
        // equalsIgnoreCase() 不分大小寫的比較
        System.out.printf("s1.equalsIgnoreCase(s5): %b\n", s1.equalsIgnoreCase(s5));
        System.out.printf("s4.equalsIgnoreCase(s5): %b\n", s4.equalsIgnoreCase(s5));
    }
}
